package com.backend.portafoliobackend.controllers;

import com.backend.portafoliobackend.models.CertComplementosModel;
import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.services.CertComplementosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/complementos")
public class CertComplementosController {
    /*Inyeccion de dependencia desde el service*/
    @Autowired
    CertComplementosService certComplementosService;

    /*metodo get all*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @GetMapping()
    public ArrayList<CertComplementosModel> obtenerComplementos(){

        return certComplementosService.obtenerComplementos();
    }

    /* metodo post*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @PostMapping
    public CertComplementosModel guardarComplementos(@RequestBody CertComplementosModel complementos){
        return this.certComplementosService.guardarComplementos(complementos);
    }

    /*Metodo get por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @GetMapping(path = "/{id}")
    public Optional<CertComplementosModel> obtenerComplementosPorID(@PathVariable("id") Long id){
        return this.certComplementosService.obtenerComplementosPorID(id);
    }

    /*metodo eliminar por id*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @DeleteMapping(path = "/{id}")
    public String eliminarComplementos( @PathVariable("id") Long id){
        boolean ok = this.certComplementosService.eliminarComplementos(id);
        if (ok){
            return  "Eliminado correctamente";
        }else{
            return "error al eliminar";
        }
    }

    /* metodo put*/
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @PutMapping
    public CertComplementosModel actualizarComplementos(@RequestBody CertComplementosModel complementos){
        return this.certComplementosService.actualizarComplementos(complementos);
    }
}
