package com.backend.portafoliobackend.controllers;
import com.backend.portafoliobackend.models.EducacionModel;
import com.backend.portafoliobackend.services.EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/educacion")
public class EducacionController {

    /*Inyeccion de dependencias*/
    @Autowired
    EducacionService educacionService;

    /*Metodo get all*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @GetMapping()
    public ArrayList<EducacionModel> obtenerEducacion(){
        return educacionService.obtenerEducacion();
    }

    /*Metodo post*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @PostMapping
    public  EducacionModel guardarEducacion(@RequestBody EducacionModel educacion){
        return this.educacionService.guardarEducacion(educacion);
    }

    /* Metodo get por Id*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @GetMapping(path = "/{id}")
    public Optional<EducacionModel> obtenerEducacionPorID(@PathVariable("id") Long id){
        return this.educacionService.obtenerEducaionPorID(id);
    }
    /*metodo put */
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @PutMapping
    public  EducacionModel actualizarEducacion(@RequestBody EducacionModel educacion){
        return this.educacionService.guardarEducacion(educacion);
    }
    /*Metodo delete por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @DeleteMapping(path = "/{id}")
    public String eliminarEducacion( @PathVariable("id") Long id){
        boolean ok = this.educacionService.eliminarEducacion(id);
        if (ok){
            return  "Eliminado correctamente";
        }else{
            return "error al eliminar";
        }
    }
}
