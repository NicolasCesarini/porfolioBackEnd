/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.service;

import com.pagina.portfolio.entity.Proyecto;
import com.pagina.portfolio.repository.RProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Argentina Programa
 */
@Service
public class SProyecto {
    @Autowired
    public RProyecto proyeRepo;
    
    public List<Proyecto> verProyectos() {
        return proyeRepo.findAll();
    }
    
    public Proyecto buscarProyecto(int id) {
        return proyeRepo.findById(id).orElse(null);
    }

    public void crearProyecto(Proyecto proye) {
        proyeRepo.save(proye);
        // Para editar uso save también
    }

    public void borrarProyecto(int id) {
        proyeRepo.deleteById(id);
    }
    
    public void editarProyecto(Proyecto proye) {
        proyeRepo.save(proye);
    }
    
}
