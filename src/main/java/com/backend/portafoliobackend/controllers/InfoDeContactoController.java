package com.backend.portafoliobackend.controllers;

import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.models.InfoDeContactoModel;
import com.backend.portafoliobackend.services.InfoDeContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/contacto")
public class InfoDeContactoController {
    /*Inyeccion de dependencia desde el service*/
    @Autowired
    InfoDeContactoService infoDeContactoService;

    /*metodo get all*/
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public ArrayList<InfoDeContactoModel> obtenerContacto(){

        return infoDeContactoService.obtenerContacto();
    }

    /* metodo post*/
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public InfoDeContactoModel guardarContacto(@RequestBody InfoDeContactoModel contacto){
        return this.infoDeContactoService.guardarContacto(contacto);
    }

    /*Metodo get por id*/
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/{id}")
    public Optional<InfoDeContactoModel> obtenerContactoPorID(@PathVariable("id") Long id){
        return this.infoDeContactoService.obtenerContactoPorID(id);
    }

    /*metodo eliminar por id*/
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(path = "/{id}")
    public String eliminarContacto( @PathVariable("id") Long id){
        boolean ok = this.infoDeContactoService.eliminarContacto(id);
        if (ok){
            return  "Eliminado correctamente";
        }else{
            return "error al eliminar";
        }
    }

    /* metodo put*/
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping
    public InfoDeContactoModel actualizarContacto(@RequestBody InfoDeContactoModel contacto){
        return this.infoDeContactoService.actualizarContacto(contacto);
    }
}
