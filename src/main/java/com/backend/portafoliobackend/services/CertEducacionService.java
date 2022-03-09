package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.CertEducacionModel;
import com.backend.portafoliobackend.repositories.CertEducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CertEducacionService {
    /*inyeccion de dependencia desde repository*/
    @Autowired
    CertEducacionRepository certEducacionRepository;

    /* metodo para obtener todos los datos del la tabla de cert educacion*/
    public ArrayList<CertEducacionModel> obtenerCertEducacion(){
        return (ArrayList<CertEducacionModel>) certEducacionRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla cert educacion */

    public CertEducacionModel guardarCertEducacion( CertEducacionModel educacion){
        return certEducacionRepository.save(educacion );
    }

    /*Metodo para buscar educacion por Id*/
    public Optional<CertEducacionModel> obtenerCertEducacionPorID(Long id){

        return certEducacionRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarCertEducacion(Long id){
        try {
            certEducacionRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para editar en la base de datos la tabla educacion */

    public CertEducacionModel actualizarEducacion( CertEducacionModel educacion){
        return certEducacionRepository.save(educacion );
    }
}
