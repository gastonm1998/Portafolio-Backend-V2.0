package com.backend.portafoliobackend.models;

import javax.persistence.*;

@Entity
@Table(name = "AboutMeBannerPrincipal")

public class AboutMeBannerPrincipalModel {

    /*Identificador principal de la tabla*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    private Long id;

    /* Nombre del creador del portafolio */
    private String nombre;

    /* Ubicacion de la imagen para el banner principal */
    private String banner;
    @Column(length = 4000)
    /* Descripcion del creador del portafolio */
    private String descripcion;

    /* Getters and setters */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
