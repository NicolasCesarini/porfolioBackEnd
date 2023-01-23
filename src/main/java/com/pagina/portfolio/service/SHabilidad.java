/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.service;

import com.pagina.portfolio.entity.Habilidad;
import com.pagina.portfolio.repository.RHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Argentina Programa
 */
@Service
public class SHabilidad{

    @Autowired
    public RHabilidad habiRepo;
    
    public List<Habilidad> verHabilidades() {
        return habiRepo.findAll();
    }
    
    public Habilidad buscarHabilidad(int id) {
        return habiRepo.findById(id).orElse(null);
    }

    public void crearHabilidad(Habilidad habi) {
        habiRepo.save(habi);
        // Para editar uso save también
    }

    public void borrarHabilidad(int id) {
        habiRepo.deleteById(id);
    }
    
    public void editarHabilidad(Habilidad habi) {
        habiRepo.save(habi);
    }
}
