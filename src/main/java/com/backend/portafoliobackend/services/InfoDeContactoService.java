package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.models.InfoDeContactoModel;
import com.backend.portafoliobackend.repositories.InfoDeContactoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class InfoDeContactoService {

    /*inyeccion de dependencia*/
    InfoDeContactoRepository infoDeContactoRepository;

    /* metodo para obtener todos los datos del la tabla de  Contacto*/
    public ArrayList<InfoDeContactoModel> obtenerContacto(){
        return (ArrayList<InfoDeContactoModel>) infoDeContactoRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla Contacto */

    public InfoDeContactoModel guardarContacto( InfoDeContactoModel contacto){
        return infoDeContactoRepository.save(contacto );
    }

    /*Metodo para buscar Contacto por Id*/
    public Optional<InfoDeContactoModel> obtenerContactoPorID(Long id){

        return infoDeContactoRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarContacto(Long id){
        try {
            infoDeContactoRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para editar en la base de datos la tabla Contacto */

    public InfoDeContactoModel actualizarContacto( InfoDeContactoModel contacto){
        return infoDeContactoRepository.save(contacto);
    }
}
