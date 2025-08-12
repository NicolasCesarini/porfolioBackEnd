/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Argentina Programa
 */

@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private int id;
    private String imgCurso;
    private String institucion;
    private String tituloCurso;
    private String anio;
    @Column(name = "descripción_Educación", length = 800)
    private String descripcionEducacion;
    
    //contructor vacio
    public Educacion() {
    }
    
    
    
    //constructor con parámetros
    public Educacion(String imgCurso, String institucion, String tituloCurso, String anio, String descripcionEducacion) {
        this.imgCurso = imgCurso;
        this.institucion = institucion;
        this.tituloCurso = tituloCurso;
        this.anio = anio;
        this.descripcionEducacion = descripcionEducacion;
    }
    

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgCurso() {
        return imgCurso;
    }

    public void setImgCurso(String imgCurso) {
        this.imgCurso = imgCurso;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTituloCurso() {
        return tituloCurso;
    }

    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDescripcionEducacion() {
        return descripcionEducacion;
    }

    public void setDescripcionEducacion(String descripcionEducacion) {
        this.descripcionEducacion = descripcionEducacion;
    }
    
    
    
    
    

    
    
    
    
}
