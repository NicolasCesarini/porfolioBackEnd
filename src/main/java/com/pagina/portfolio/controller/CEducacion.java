/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.controller;

import com.pagina.portfolio.entity.Educacion;
import com.pagina.portfolio.service.SEducacion;
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
@RequestMapping("educacion/")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {

    @Autowired
    private SEducacion eduServ;
    
    @GetMapping ("lista")
    @ResponseBody
    public List<Educacion> verEducacion () {
        return eduServ.verEducacion();
    }
    
    @GetMapping ("ver/{id}")
    @ResponseBody
    public Educacion verEstudio (@PathVariable int id) {
        return eduServ.buscarEducacion(id);
    }
            
    @PostMapping ("crear")
    public String agregarEducacion (@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
        return "La educacion fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("borrar/{id}")
    public String borrarEducacion (@PathVariable int id){
        eduServ.borrarEducacion(id);
        return "La educacion fue borrada correctamente";
    }
    
    
    
    @PutMapping ("editar/{id}")
    public String updateEducacion (@RequestBody Educacion edu) {
        eduServ.editarEducacion(edu);
        return "La educacion fue editada correctamente";
    }
}
