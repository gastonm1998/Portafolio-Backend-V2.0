package com.backend.portafoliobackend.models;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "certificadoJavaScript")
public class CertJavaScriptModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    private Long id;

    /*columna titulo*/
    private String titulo;

    /*columna fecha de finalizacion */
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    /* link del banner*/
    private String direccionBanner;

    /*Entidad Emisora*/
    private String entidadEmisora;

    /*link del certificado*/
    private String linkCertificado;

    /* Getters and Setters */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDireccionBanner() {
        return direccionBanner;
    }

    public void setDireccionBanner(String direccionBanner) {
        this.direccionBanner = direccionBanner;
    }

    public String getEntidadEmisora() {
        return entidadEmisora;
    }

    public void setEntidadEmisora(String entidadEmisora) {
        this.entidadEmisora = entidadEmisora;
    }

    public String getLinkCertificado() {
        return linkCertificado;
    }

    public void setLinkCertificado(String linkCertificado) {
        this.linkCertificado = linkCertificado;
    }
}
