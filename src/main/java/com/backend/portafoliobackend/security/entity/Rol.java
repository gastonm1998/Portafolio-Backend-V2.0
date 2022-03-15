package com.backend.portafoliobackend.security.entity;

import com.backend.portafoliobackend.security.enums.RolNombre;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @NonNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    /*Constructores*/

    public Rol() {
    }

    public Rol(@NonNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    /*getters and setters*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(@NonNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
}
