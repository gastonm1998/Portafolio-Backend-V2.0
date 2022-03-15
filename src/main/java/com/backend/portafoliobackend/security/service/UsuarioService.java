package com.backend.portafoliobackend.security.service;

import com.backend.portafoliobackend.security.entity.Usuario;
import com.backend.portafoliobackend.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return  usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existByNombreUsuario(String nombreUsuario){
        return  usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existByNombreEmail(String email){
        return  usuarioRepository.existsByEmail(email);
    }

    public void  save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
