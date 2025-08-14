/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.service;

import com.pagina.portfolio.entity.Redes;
import com.pagina.portfolio.repository.RRedes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Argentina Programa
 */
@Service
public class SRedes {
    @Autowired
    public RRedes redRepo;
    
    public List<Redes> verRedes() {
        return redRepo.findAll();
    }
    
    public Redes buscarRed(int id) {
        return redRepo.findById(id).orElse(null);
    }

    public void crearRed(Redes red) {
        redRepo.save(red);
        // Para editar uso save también
    }

    public void borrarRed(int id) {
        redRepo.deleteById(id);
    }
    
    public void editarRed(Redes red) {
        redRepo.save(red);
    }
    
}

