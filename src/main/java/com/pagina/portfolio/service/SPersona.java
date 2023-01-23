/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.service;

import com.pagina.portfolio.entity.Persona;
import com.pagina.portfolio.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Argentina Programa
 */

@Service
public class SPersona{

    @Autowired
    public RPersona persoRepo;
    
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }
    
    public Persona buscarPersona(int id) {
        return persoRepo.findById(id).orElse(null);
    }

    public void crearPersona(Persona perso) {
        persoRepo.save(perso);
        // Para editar uso save también
    }

    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }
    
    public void editarPersona(Persona perso) {
        persoRepo.save(perso);
    }
    
    
    public Persona loginPersona(String email, String clave) {
        List <Persona> personas = persoRepo.findByEmailAndClave(email, clave);
        if(!personas.isEmpty()){
            return personas.get(0); //si la lista no esta vacía ,e devuelve la de la posición 0
        }
        return null;
    }
    
    

    
    
}
