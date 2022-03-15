package com.backend.portafoliobackend.security.service;


import com.backend.portafoliobackend.security.entity.Rol;
import com.backend.portafoliobackend.security.enums.RolNombre;
import com.backend.portafoliobackend.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNOmbre(RolNombre rolNombre){
        /*revisar capitulo 3*/
        return  rolRepository.findByNombre(rolNombre);
    }
}
