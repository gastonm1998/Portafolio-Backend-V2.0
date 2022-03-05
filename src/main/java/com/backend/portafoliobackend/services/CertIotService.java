package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.CertIotModel;
import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.repositories.CertIotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CertIotService {

    /*inyeccion de dependencia desde repository*/
    @Autowired
    CertIotRepository certIotRepository;

    /* metodo para obtener todos los datos del la tabla de cer Iot*/
    public ArrayList<CertIotModel> obtenerIot(){
        return (ArrayList<CertIotModel>) certIotRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla cert Iot */

    public CertIotModel guardarIot( CertIotModel iot){
        return certIotRepository.save(iot);
    }

    /*Metodo para buscar Iot por Id*/
    public Optional<CertIotModel> obtenerIotPorID(Long id){

        return certIotRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarIot(Long id){
        try {
            certIotRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para editar en la base de datos la tabla Iot */

    public CertIotModel actualizarIot( CertIotModel iot){
        return certIotRepository.save(iot );
    }
}
