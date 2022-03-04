package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.models.CertPythonModel;
import com.backend.portafoliobackend.repositories.CertPythonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CertPythonService {
    /*inyeccion de dependencia desde repository*/
    @Autowired
    CertPythonRepository certPythonRepository;

    /* metodo para obtener todos los datos del la tabla de cer python*/
    public ArrayList<CertPythonModel> obtenerPython(){
        return (ArrayList<CertPythonModel>) certPythonRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla cert Python */

    public CertPythonModel guardarPython( CertPythonModel python){
        return certPythonRepository.save(python);
    }

    /*Metodo para buscar Python por Id*/
    public Optional<CertPythonModel> obtenerPythonPorID(Long id){

        return certPythonRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarPython(Long id){
        try {
            certPythonRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para editar en la base de datos la tabla Python */

    public CertPythonModel actualizarPython( CertPythonModel python){
        return certPythonRepository.save(python );
    }
}
