package com.backend.portafoliobackend.models;

import javax.persistence.*;


@Entity
@Table(name = "infoContacto")
public class InfoDeContactoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    private Long id;

    /*columna contenido*/
    private String contenido;

    /* codigo icono*/
    private String icono;

    /*Getter and Setters*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
}
