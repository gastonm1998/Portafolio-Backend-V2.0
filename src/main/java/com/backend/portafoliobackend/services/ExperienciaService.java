package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.ExperienciaModel;
import com.backend.portafoliobackend.repositories.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ExperienciaService {

    /*inyeccion de dependencias de la interfaz ExperienciaRepository*/
    @Autowired
    ExperienciaRepository experienciaRepository;

    /* metodo para obtener todos los datos del la tabla de experiencia*/
    public ArrayList<ExperienciaModel> obtenerExperiencia(){
        return (ArrayList<ExperienciaModel>) experienciaRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla experiencia */
    /*revisar*/
    public ExperienciaModel guardarExperiencia( ExperienciaModel experiencia){
        return experienciaRepository.save(experiencia );
    }

    /*Metodo para buscar experiencia por Id*/
    public Optional<ExperienciaModel> obtenerExperienciaPorID(Long id){
        return experienciaRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarExperiencia(Long id){
        try {
            experienciaRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para guardar en la base de datos la tabla experiencia */

    public ExperienciaModel actualizarExperiencia( ExperienciaModel experiencia){
        return experienciaRepository.save(experiencia );
    }
}
