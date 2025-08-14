/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.service;

import com.pagina.portfolio.entity.Experiencia;
import com.pagina.portfolio.repository.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Argentina Programa
 */
@Service
public class SExperiencia{

    @Autowired
    public RExperiencia expeRepo;
    
    public List<Experiencia> verExperiencias() {
        return expeRepo.findAll();
    }
    
    public Experiencia buscarExperiencia(int id) {
        return expeRepo.findById(id).orElse(null);
    }

    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
        // Para editar uso save también
    }

    public void borrarExperiencia(int id) {
        expeRepo.deleteById(id);
    }
    
    public void editarExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }
    
}
