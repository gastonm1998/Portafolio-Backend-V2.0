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
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @GetMapping()
    public ArrayList<ExperienciaModel> obtenerExperiencia(){
        return experienciaService.obtenerExperiencia();
    }

    /* metodo post*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @PostMapping
    public ExperienciaModel guardarExperiencia(@RequestBody ExperienciaModel experiencia){
        return this.experienciaService.guardarExperiencia(experiencia);
    }

    /*Metodo get por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @GetMapping(path = "/{id}")
    public Optional<ExperienciaModel> obtenerExperienciaPorID( @PathVariable("id") Long id){
        return this.experienciaService.obtenerExperienciaPorID(id);
    }

    /*metodo eliminar por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
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
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @PutMapping
    public ExperienciaModel actualizarExperiencia(@RequestBody ExperienciaModel experiencia){
        return this.experienciaService.guardarExperiencia(experiencia);
    }
}
