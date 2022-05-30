package com.backend.portafoliobackend.controllers;

import com.backend.portafoliobackend.models.AboutMeBannerPrincipalModel;
import com.backend.portafoliobackend.services.AboutMeBannerPrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/bannerPrincipal")
public class AboutMeBannerPrincipalController {

    /*Inyeccion de dependencia desde el service*/
    @Autowired
    AboutMeBannerPrincipalService aboutMeBannerPrincipalService;
    /*@CrossOrigin(origins = "http://localhost:4200/")*/
    /*@CrossOrigin(origins = "https://portafolio-gaston-m-frontend.herokuapp.com/")*/
    //@CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app/")
    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @GetMapping
    public ArrayList<AboutMeBannerPrincipalModel> obtenerBannerPrincipal(){
        return aboutMeBannerPrincipalService.obtenerBannerPrincipal();
    }

    @CrossOrigin(origins = "https://portafolio-gaston-monasterio.web.app")
    @PutMapping
    public AboutMeBannerPrincipalModel actualizarBannerPrincipal(@RequestBody AboutMeBannerPrincipalModel bannerPrincipal){
        return this.aboutMeBannerPrincipalService.actualizarBannerPrincipal(bannerPrincipal);
    }
}
