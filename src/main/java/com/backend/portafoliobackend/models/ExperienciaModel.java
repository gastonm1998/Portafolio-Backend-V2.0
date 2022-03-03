package com.backend.portafoliobackend.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tablaExperiencia")

public class ExperienciaModel {

    /*Identificador principal de la tabla*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    private Long id;

    /*columna nombre empresa*/
    private String nombreEmpresa;

    /*columna fecha de inicio */
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    /*columna fecha de finalizacion*/
    @Temporal(TemporalType.DATE)
    private Date FechaFin;

    /*columna que guarda el codigo del color hexadecimal*/
    private String color;

    /*columna que guarda la descripcion del trabajo realizado*/
    private String descripcion;

    /*Getters and Setters*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        FechaFin = fechaFin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

