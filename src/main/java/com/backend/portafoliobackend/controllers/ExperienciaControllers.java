package com.backend.portafoliobackend.controllers;
import com.backend.portafoliobackend.models.ExperienciaModel;
import com.backend.portafoliobackend.services.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaControllers {

    /*Inyeccion de dependencia desde el service*/
    @Autowired
    ExperienciaService experienciaService;

    /*metodo get all*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @GetMapping()
    public ArrayList<ExperienciaModel> obtenerExperiencia(){
        return experienciaService.obtenerExperiencia();
    }

    /* metodo post*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @PostMapping
    public ExperienciaModel guardarExperiencia(@RequestBody ExperienciaModel experiencia){
        return this.experienciaService.guardarExperiencia(experiencia);
    }

    /*Metodo get por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @GetMapping(path = "/{id}")
    public Optional<ExperienciaModel> obtenerExperienciaPorID( @PathVariable("id") Long id){
        return this.experienciaService.obtenerExperienciaPorID(id);
    }

    /*metodo eliminar por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @DeleteMapping(path = "/{id}")
    public String eliminarExperiencia( @PathVariable("id") Long id){
        boolean ok = this.experienciaService.eliminarExperiencia(id);
        if (ok){
            return  "Eliminado correctamente";
        }else{
            return "error al eliminar";
        }
    }

    /* metodo put*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @PutMapping
    public ExperienciaModel actualizarExperiencia(@RequestBody ExperienciaModel experiencia){
        return this.experienciaService.guardarExperiencia(experiencia);
    }
}
