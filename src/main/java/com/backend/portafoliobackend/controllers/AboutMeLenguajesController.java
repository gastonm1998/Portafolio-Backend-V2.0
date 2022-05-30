package com.backend.portafoliobackend.controllers;

import com.backend.portafoliobackend.models.AboutMeLenguajesModel;
import com.backend.portafoliobackend.services.AboutMeLenguajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/lenguajes")
public class AboutMeLenguajesController {

    /*Inyeccion de dependencia desde el lenguaje service*/
    @Autowired
    AboutMeLenguajesService aboutMeLenguajesService;

    /*metodo get all*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @GetMapping()
    public ArrayList<AboutMeLenguajesModel> obtenerLenguaje()
    {
        return aboutMeLenguajesService.obtenerLenguajes();

    }

    /* metodo post*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @PostMapping
    public AboutMeLenguajesModel guardarLenguaje(@RequestBody AboutMeLenguajesModel lenguaje){
        return this.aboutMeLenguajesService.guardarLenguajes(lenguaje);
    }

    /*Metodo get por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @GetMapping(path = "/{id}")
    public Optional<AboutMeLenguajesModel> obtenerLenguajesPorID(@PathVariable("id") Long id){
        return this.aboutMeLenguajesService.obtenerLenguajesPorID(id);
    }

    /*metodo eliminar por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @DeleteMapping(path = "/{id}")
    public String eliminarLenguaje( @PathVariable("id") Long id){
        boolean ok = this.aboutMeLenguajesService.eliminarLenguaje(id);
        if (ok){
            return  "Eliminado correctamente";
        }else{
            return "error al eliminar";
        }
    }

    /* metodo put*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @PutMapping
    public AboutMeLenguajesModel actualizarLenguajes(@RequestBody AboutMeLenguajesModel lenguajes){
        return this.aboutMeLenguajesService.actualizarLenguajes(lenguajes);
    }

}
