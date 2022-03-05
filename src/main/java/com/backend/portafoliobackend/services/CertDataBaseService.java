package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.CertDataBaseModel;
import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.repositories.CertDataBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CertDataBaseService {

    /*inyeccion de dependencia desde repository*/
    @Autowired
    CertDataBaseRepository certDataBaseRepository;

    /* metodo para obtener todos los datos del la tabla de cer DataBase*/
    public ArrayList<CertDataBaseModel> obtenerDataBase(){
        return (ArrayList<CertDataBaseModel>) certDataBaseRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla cert DataBase*/

    public CertDataBaseModel guardarDataBase( CertDataBaseModel dataBase){
        return certDataBaseRepository.save(dataBase);
    }

    /*Metodo para buscar DataBase por Id*/
    public Optional<CertDataBaseModel> obtenerDataBasePorID(Long id){

        return certDataBaseRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarDataBase(Long id){
        try {
            certDataBaseRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para editar en la base de datos la tabla javaScript */

    public CertDataBaseModel actualizarDataBase( CertDataBaseModel dataBase){
        return certDataBaseRepository.save(dataBase );
    }

}
