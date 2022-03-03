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
    @CrossOrigin(origins = "https://localhost:4200")
    @GetMapping()
    public ArrayList<EducacionModel> obtenerEducacion(){
        return educacionService.obtenerEducacion();
    }

    /*Metodo post*/
    @CrossOrigin(origins = "https://localhost:4200")
    @PostMapping
    public  EducacionModel guardarEducacion(@RequestBody EducacionModel educacion){
        return this.educacionService.guardarEducacion(educacion);
    }

    /* Metodo get por Id*/
    @CrossOrigin(origins = "https://localhost:4200")
    @GetMapping(path = "/{id}")
    public Optional<EducacionModel> obtenerEducacionPorID(@PathVariable("id") Long id){
        return this.educacionService.obtenerEducaionPorID(id);
    }
    /*metodo put */
    @CrossOrigin(origins = "https://localhost:4200")
    @PutMapping
    public  EducacionModel actualizarEducacion(@RequestBody EducacionModel educacion){
        return this.educacionService.guardarEducacion(educacion);
    }
}
