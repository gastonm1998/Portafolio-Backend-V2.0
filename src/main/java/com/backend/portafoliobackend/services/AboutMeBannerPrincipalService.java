package com.backend.portafoliobackend.services;

import com.backend.portafoliobackend.models.AboutMeBannerPrincipalModel;
import com.backend.portafoliobackend.repositories.AboutMeBannerPrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AboutMeBannerPrincipalService {

    /*inyeccion de dependencia desde el repository*/
    @Autowired
    AboutMeBannerPrincipalRepository aboutMeBannerPrincipalRepository;

    /*Obtener datos desde la tabla del banner principal*/
    public ArrayList<AboutMeBannerPrincipalModel> obtenerBannerPrincipal(){
        return (ArrayList<AboutMeBannerPrincipalModel>) aboutMeBannerPrincipalRepository.findAll();
    }

    /*Metodo para editar la tabla banner principal*/
    public AboutMeBannerPrincipalModel actualizarBannerPrincipal(AboutMeBannerPrincipalModel banner){
        return aboutMeBannerPrincipalRepository.save(banner);
    }
}
