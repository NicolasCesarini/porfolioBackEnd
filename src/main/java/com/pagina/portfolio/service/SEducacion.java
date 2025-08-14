/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.service;

import com.pagina.portfolio.entity.Educacion;
import com.pagina.portfolio.repository.REducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Argentina Programa
 */

@Service
public class SEducacion{

    @Autowired
    public REducacion eduRepo;
    
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }
    
    public Educacion buscarEducacion(int id) {
        return eduRepo.findById(id).orElse(null);
    }

    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
        // Para editar uso save también
    }

    public void borrarEducacion(int id) {
        eduRepo.deleteById(id);
    }
    
    public void editarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }
    
    
    
}
