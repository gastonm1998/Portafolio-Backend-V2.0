package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.CertComplementosModel;
import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.repositories.CertComplementosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CertComplementosService {

    /*inyeccion de dependencia desde repository*/
    @Autowired
    CertComplementosRepository certComplementosRepository;

    /* metodo para obtener todos los datos del la tabla de cer Complementos*/
    public ArrayList<CertComplementosModel> obtenerComplementos(){
        return (ArrayList<CertComplementosModel>) certComplementosRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla cert Complementos */

    public CertComplementosModel guardarComplementos( CertComplementosModel complementos){
        return certComplementosRepository.save(complementos);
    }

    /*Metodo para buscar Complementos por Id*/
    public Optional<CertComplementosModel> obtenerComplementosPorID(Long id){

        return certComplementosRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarComplementos(Long id){
        try {
            certComplementosRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para editar en la base de datos la tabla Complementos */

    public CertComplementosModel actualizarComplementos( CertComplementosModel complementos){
        return certComplementosRepository.save(complementos);
    }
}
