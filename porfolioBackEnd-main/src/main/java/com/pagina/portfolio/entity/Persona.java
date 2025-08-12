/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.entity;

/**
 *
 * @author Argentina Programa
 */

//ctrl +s para guardar
// ctrl + shift + i
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private int id;
    
    private String nombre;
    private String apellido;
    private int edad;
    private String imgPerfil;
    private String imgBanner;
    private String linkCV;
    
    @Lob
    private String email;
    
    private String clave;
    
    //@Temporal(TemporalType.DATE)
    //private Date nacimiento;
    
    //longtext
    @Column(name = "acerca_de", length = 800)
    private String acercaDe;
    
    //alt + insert para abrir el menú y agregar constructor y getters y setter
    //contructor vacio

    public Persona() {
    }

    //constructor con parámetros
    public Persona(String nombre, String apellido, int edad, String imgPerfil, String imgBanner, String linkCV, String email, String clave, String acercaDe) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.imgPerfil = imgPerfil;
        this.imgBanner = imgBanner;
        this.linkCV = linkCV;
        this.email = email;
        this.clave = clave;
        this.acercaDe = acercaDe;
    }
    
    
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getImgBanner() {
        return imgBanner;
    }

    public void setImgBanner(String imgBanner) {
        this.imgBanner = imgBanner;
    }

    public String getLinkCV() {
        return linkCV;
    }

    public void setLinkCV(String linkCV) {
        this.linkCV = linkCV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }
    
    

    
   
}
    