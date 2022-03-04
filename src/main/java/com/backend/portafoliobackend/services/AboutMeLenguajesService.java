package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.AboutMeLenguajesModel;
import com.backend.portafoliobackend.models.AboutMeSoftSkillsModel;
import com.backend.portafoliobackend.models.ExperienciaModel;
import com.backend.portafoliobackend.repositories.AboutMeLenguajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AboutMeLenguajesService {

    /*Inyectamos el about me lenguajes repository*/
    @Autowired
    AboutMeLenguajesRepository aboutMeLenguajesRepository;

    /* metodo para obtener todos los datos del la tabla de experiencia*/
    public ArrayList<AboutMeLenguajesModel> obtenerLenguajes(){
        return (ArrayList<AboutMeLenguajesModel>) aboutMeLenguajesRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla lenguaje */
    public AboutMeLenguajesModel guardarLenguajes(AboutMeLenguajesModel lenguajes){
        return aboutMeLenguajesRepository.save(lenguajes);
    }

    /*Metodo para buscar Lenguaje por Id*/
    public Optional<AboutMeLenguajesModel> obtenerLenguajesPorID(Long id){
        return aboutMeLenguajesRepository.findById(id);
    }

    /*Metodo para eliminar lenguaje por id*/
    public boolean eliminarLenguaje(Long id){
        try {
            aboutMeLenguajesRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para editar en la base de datos la tabla lenguajes */

    public AboutMeLenguajesModel actualizarLenguajes( AboutMeLenguajesModel lenguajes){
        return aboutMeLenguajesRepository.save(lenguajes );
    }
}
