package com.backend.portafoliobackend.models;

import javax.persistence.*;

@Entity
@Table(name = "softSkills")
public class AboutMeSoftSkillsModel {

    /*Identificador principal de la tabla*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    private Long id;

    /*columna de softskill*/
    private String softSkill;

    /*columna de porcentaje*/
    private  Long pocentaje;

    /*getters and setters*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoftSkill() {
        return softSkill;
    }

    public void setSoftSkill(String softSkill) {
        this.softSkill = softSkill;
    }

    public Long getPocentaje() {
        return pocentaje;
    }

    public void setPocentaje(Long pocentaje) {
        this.pocentaje = pocentaje;
    }
}
