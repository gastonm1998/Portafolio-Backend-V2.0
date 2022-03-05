package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.CertHtmlCssModel;
import com.backend.portafoliobackend.models.CertJavaScriptModel;
import com.backend.portafoliobackend.repositories.CertHtmlCssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CertHtmlCssService {
    /*inyeccion de dependencia desde repository*/
    @Autowired
    CertHtmlCssRepository certHtmlCssRepository;

    /* metodo para obtener todos los datos del la tabla de cer CssHtml*/
    public ArrayList<CertHtmlCssModel> obtenerCssHtml(){
        return (ArrayList<CertHtmlCssModel>) certHtmlCssRepository.findAll();
    }

    /* metodo para guardar en la base de datos la tabla cert CssHtml */

    public CertHtmlCssModel guardarCssHtml( CertHtmlCssModel cssHtml){
        return certHtmlCssRepository.save(cssHtml );
    }

    /*Metodo para buscar CssHtml por Id*/
    public Optional<CertHtmlCssModel> obtenerCssHtmlPorID(Long id){

        return certHtmlCssRepository.findById(id);
    }

    /*Metodo para eliminar por id*/
    public boolean eliminarCssHtml(Long id){
        try {
            certHtmlCssRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /* metodo para editar en la base de datos la tabla CssHtml */

    public CertHtmlCssModel actualizarCssHtml( CertHtmlCssModel cssHtml){
        return certHtmlCssRepository.save(cssHtml );
    }
}
