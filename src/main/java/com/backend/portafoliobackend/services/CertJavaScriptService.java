package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.models.ExperienciaModel;
import com.backend.portafoliobackend.repositories.CertJavaScriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CertJavaScriptService {

    /*inyeccion de dependencia desde repository*/
    @Autowired
    CertJavaScriptRepository certJavaScriptRepository;

    /* metodo para obtener todos los datos del la tabla de cer javascript*/
    public ArrayList<CertJavaScriptModel> obtenerJavaScript(){
        return (ArrayList<CertJavaScriptModel>) certJavaScriptRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla cert javascript */

    public CertJavaScriptModel guardarJavaScript( CertJavaScriptModel javaScript){
        return certJavaScriptRepository.save(javaScript );
    }

    /*Metodo para buscar javascript por Id*/
    public Optional<CertJavaScriptModel> obtenerJavaScriptPorID(Long id){

        return certJavaScriptRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarJavaScript(Long id){
        try {
            certJavaScriptRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para editar en la base de datos la tabla javaScript */

    public CertJavaScriptModel actualizarJavaScript( CertJavaScriptModel javaScript){
        return certJavaScriptRepository.save(javaScript );
    }
}
