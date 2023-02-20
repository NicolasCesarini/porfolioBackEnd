/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Argentina Programa
 */
@Entity
public class Redes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private int id;
    private String red;
    private String link;
    private String color;
    
    //contructor vacio

    public Redes() {
    }
    
    //constructor con parámetros

    public Redes(String red, String link, String color) {
        this.red = red;
        this.link = link;
        this.color = color;
    }
    
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   

}
