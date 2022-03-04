package com.backend.portafoliobackend.controllers;

import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.models.CertPythonModel;
import com.backend.portafoliobackend.services.CertPythonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/python")
public class CertPythonController {
    /*Inyeccion de dependencia desde el service*/
    @Autowired
    CertPythonService certPythonService;

    /*metodo get all*/
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public ArrayList<CertPythonModel> obtenerPython(){

        return certPythonService.obtenerPython();
    }

    /* metodo post*/
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public CertPythonModel guardarPython(@RequestBody CertPythonModel python){
        return this.certPythonService.guardarPython(python);
    }

    /*Metodo get por id*/
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/{id}")
    public Optional<CertPythonModel> obtenerPythonPorID(@PathVariable("id") Long id){
        return this.certPythonService.obtenerPythonPorID(id);
    }

    /*metodo eliminar por id*/
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(path = "/{id}")
    public String eliminarPython( @PathVariable("id") Long id){
        boolean ok = this.certPythonService.eliminarPython(id);
        if (ok){
            return  "Eliminado correctamente";
        }else{
            return "error al eliminar";
        }
    }

    /* metodo put*/
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping
    public CertPythonModel actualizarPython(@RequestBody CertPythonModel python){
        return this.certPythonService.actualizarPython(python);
    }
    
}
