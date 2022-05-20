package com.backend.portafoliobackend.controllers;

import com.backend.portafoliobackend.models.AboutMeSoftSkillsModel;
import com.backend.portafoliobackend.models.ExperienciaModel;
import com.backend.portafoliobackend.services.AboutMeSoftSkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/softSkills")
public class AboutMeSoftSkillsController {

    /*Inyeccion de dependencia desde service soft skills*/
    @Autowired
    AboutMeSoftSkillsService aboutMeSoftSkillsService;

    /*metodo get all */
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @GetMapping()
    public ArrayList<AboutMeSoftSkillsModel> obtenerSoftSkills(){
        return aboutMeSoftSkillsService.obtenerSoftSkills();
    }

    /*metodo post*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @PostMapping
    public AboutMeSoftSkillsModel guardarSoftSkills(@RequestBody AboutMeSoftSkillsModel softSkills){
        return this.aboutMeSoftSkillsService.guardarSoftSkills(softSkills);
    }

    /*Metodo get por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @GetMapping(path = "/{id}")
    public Optional<AboutMeSoftSkillsModel> obtenerSoftSkillsPorID(@PathVariable("id") Long id){
        return this.aboutMeSoftSkillsService.obtenerSoftSkillsPorID(id);
    }

    /*metodo eliminar por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @DeleteMapping(path = "/{id}")
    public String eliminarSoftSkills( @PathVariable("id") Long id){
        boolean ok = this.aboutMeSoftSkillsService.eliminarSoftSkills(id);
        if (ok){
            return  "Eliminado correctamente";
        }else{
            return "error al eliminar";
        }
    }

    /* metodo put*/

    @CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")
    @PutMapping
    public AboutMeSoftSkillsModel actualizarSoftSkill(@RequestBody AboutMeSoftSkillsModel softSkill){
        return this.aboutMeSoftSkillsService.actualizarSoftSkill(softSkill);
    }
}
