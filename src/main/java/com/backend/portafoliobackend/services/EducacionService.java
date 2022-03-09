package com.backend.portafoliobackend.services;
import com.backend.portafoliobackend.models.EducacionModel;
import com.backend.portafoliobackend.repositories.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EducacionService {

    /*Inyeccion de dependencias*/
    @Autowired
    EducacionRepository educacionRepository;

    /*metodo para obtener datos de tabla Educacion*/
    public ArrayList<EducacionModel> obtenerEducacion(){
        return (ArrayList<EducacionModel>) educacionRepository.findAll();
    }

    /*Metodo para guardar en la base de datos la tabla Educacion*/
    public EducacionModel guardarEducacion(EducacionModel educacion){
        return educacionRepository.save(educacion);
    }

    /*Metodo para buscar educacion por id*/
    public Optional<EducacionModel> obtenerEducaionPorID(Long id){
        return educacionRepository.findById(id);
    }

    /*Metodo para eliminar por ID*/
    public boolean eliminarEducacion(Long id){
        try {
            educacionRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /*Metodo para editar en la base de datos la tabla educacion*/
    public  EducacionModel actualizarEducacion(EducacionModel educacion){
        return educacionRepository.save(educacion);
    }
}
