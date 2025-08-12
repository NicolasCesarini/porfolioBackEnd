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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private int id;
    private String imgExperiencia;
    private String empresa;
    private String puesto;
    private String anio;
    
    @Column(name = "descripcion_Trabajo", length = 800)
    private String descripcionTrabajo;
    
    //contructor vacio
    public Experiencia() {
    }
  
    

    
    //constructor con parámetros
    public Experiencia(String imgExperiencia, String empresa, String puesto, String anio, String descripcionTrabajo) {
        this.imgExperiencia = imgExperiencia;
        this.empresa = empresa;
        this.puesto = puesto;
        this.anio = anio;
        this.descripcionTrabajo = descripcionTrabajo;
    }
    


    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgExperiencia() {
        return imgExperiencia;
    }

    public void setImgExperiencia(String imgExperiencia) {
        this.imgExperiencia = imgExperiencia;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDescripcionTrabajo() {
        return descripcionTrabajo;
    }

    public void setDescripcionTrabajo(String descripcionTrabajo) {
        this.descripcionTrabajo = descripcionTrabajo;
    }
    
    

    

    

    
    

   

    
    
    
}
