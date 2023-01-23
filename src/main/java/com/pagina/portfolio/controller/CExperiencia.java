/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.controller;

import com.pagina.portfolio.entity.Experiencia;
import com.pagina.portfolio.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Argentina Programa
 */
@RestController
@RequestMapping("experiencia/")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {

    @Autowired
    private SExperiencia expeServ;
    
    @GetMapping ("lista")
    @ResponseBody
    public List<Experiencia> verExperiencias () {
        return expeServ.verExperiencias();
    }
    
    @GetMapping ("ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia (@PathVariable int id) {
        return expeServ.buscarExperiencia(id);
    }
            
    @PostMapping ("crear")
    public String agregarExperiencia (@RequestBody Experiencia expe) {
        expeServ.crearExperiencia(expe);
        return "La experiencia fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("borrar/{id}")
    public String borrarExperiencia (@PathVariable int id){
        expeServ.borrarExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }
    
    
    
    @PutMapping ("editar/{id}")
    public String updateExperiencia (@RequestBody Experiencia expe) {
        expeServ.editarExperiencia(expe);
        return "La experiencia fue editada correctamente";
    }
}
