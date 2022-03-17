package com.backend.portafoliobackend.security.controller;

import com.backend.portafoliobackend.security.dto.JwtDto;
import com.backend.portafoliobackend.security.dto.LoginUsuario;
import com.backend.portafoliobackend.security.dto.NuevoUsuario;
import com.backend.portafoliobackend.security.entity.Rol;
import com.backend.portafoliobackend.security.entity.Usuario;
import com.backend.portafoliobackend.security.enums.RolNombre;
import com.backend.portafoliobackend.security.jwt.JwtProvider;
import com.backend.portafoliobackend.security.service.RolService;
import com.backend.portafoliobackend.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/nuevo")                                                /*valid?*/
    public ResponseEntity<?> nuevo(@Validated @RequestBody NuevoUsuario nuevoUsuario, BindingResult  bindingResult){
        if (bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("campos mal puestos"), HttpStatus.BAD_REQUEST);
        if (usuarioService.existByNombreUsuario(nuevoUsuario.getNombreUsuario()))
            return new ResponseEntity(new Mensaje("nombre ya existe"),HttpStatus.BAD_REQUEST);
        if (usuarioService.existByNombreEmail(nuevoUsuario.getEmail()))
            return new ResponseEntity(new Mensaje("email ya existe"),HttpStatus.BAD_REQUEST);
        Usuario usuario = new Usuario(nuevoUsuario.getNombre(), nuevoUsuario.getNombreUsuario(), nuevoUsuario.getEmail(), passwordEncoder.encode(nuevoUsuario.getPassword()));

        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolNOmbre(RolNombre.ROLE_USER).get());
        if (nuevoUsuario.getRoles().contains("admin"))
            roles.add(rolService.getByRolNOmbre(RolNombre.ROLE_ADMIN).get());
        usuario.setRoles(roles);
        usuarioService.save(usuario);
        return new ResponseEntity(new Mensaje("usuario guardado"), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto>login(@Validated @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return  new ResponseEntity(new Mensaje("campos mal puestos"), HttpStatus.BAD_REQUEST);
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(),loginUsuario.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        JwtDto jwtDto =new JwtDto(jwt,userDetails.getUsername(), userDetails.getAuthorities());
        return new ResponseEntity(jwtDto,HttpStatus.OK);
    }
}
