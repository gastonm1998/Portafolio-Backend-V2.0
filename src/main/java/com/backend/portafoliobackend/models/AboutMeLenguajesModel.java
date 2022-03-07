package com.backend.portafoliobackend.models;

import javax.persistence.*;

@Entity
@Table(name = "lenguajes")
public class AboutMeLenguajesModel {
    /*Identificador principal de la tabla*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    private Long id;

    /* columna nombre del lenguaje*/
    private String nombreDelLenguaje;

    /* columna porcentaje de dominio*/
    private String dominio;

    /*color de barra */
    private  String colorBarra;

    /*color de fondo*/
    private String colorFondo;

    /*getters and setters*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreDelLenguaje() {
        return nombreDelLenguaje;
    }

    public void setNombreDelLenguaje(String nombreDelLenguaje) {
        this.nombreDelLenguaje = nombreDelLenguaje;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getColorBarra() {
        return colorBarra;
    }

    public void setColorBarra(String colorBarra) {
        this.colorBarra = colorBarra;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }
}
