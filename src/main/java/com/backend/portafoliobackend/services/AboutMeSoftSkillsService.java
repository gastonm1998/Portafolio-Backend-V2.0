package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.AboutMeSoftSkillsModel;
import com.backend.portafoliobackend.repositories.AboutMeSoftSkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AboutMeSoftSkillsService {

    /*inyeccion de dependencia desde softskills repository*/
    @Autowired
    AboutMeSoftSkillsRepository aboutMeSoftSkillsRepository;

    /*metodo para obtener los datos de la tabla soft skills*/

    public ArrayList<AboutMeSoftSkillsModel> obtenerSoftSkills(){
        return (ArrayList<AboutMeSoftSkillsModel>) aboutMeSoftSkillsRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla soft skills*/
    public AboutMeSoftSkillsModel guardarSoftSkills(AboutMeSoftSkillsModel softSkill){
        return aboutMeSoftSkillsRepository.save(softSkill);
    }

    /*metodo para devolver datos por id*/
    public Optional<AboutMeSoftSkillsModel> obtenerSoftSkillsPorID(Long id){
        return aboutMeSoftSkillsRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarSoftSkills(Long id){
        try {
            aboutMeSoftSkillsRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /*Metodo para editar datos soft skills*/
    public AboutMeSoftSkillsModel actualizarSoftSkill(AboutMeSoftSkillsModel softSkill){
        return aboutMeSoftSkillsRepository.save(softSkill);
    }
}
