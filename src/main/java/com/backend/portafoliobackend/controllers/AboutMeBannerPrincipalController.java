package com.backend.portafoliobackend.controllers;

import com.backend.portafoliobackend.models.AboutMeBannerPrincipalModel;
import com.backend.portafoliobackend.services.AboutMeBannerPrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/bannerPrincipal")
public class AboutMeBannerPrincipalController {

    /*Inyeccion de dependencia desde el service*/
    @Autowired
    AboutMeBannerPrincipalService aboutMeBannerPrincipalService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ArrayList<AboutMeBannerPrincipalModel> obtenerBannerPrincipal(){
        return aboutMeBannerPrincipalService.obtenerBannerPrincipal();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping
    public AboutMeBannerPrincipalModel actualizarBannerPrincipal(@RequestBody AboutMeBannerPrincipalModel bannerPrincipal){
        return this.aboutMeBannerPrincipalService.actualizarBannerPrincipal(bannerPrincipal);
    }
}
