/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.controller;

import com.pagina.portfolio.entity.Habilidad;
import com.pagina.portfolio.service.SHabilidad;
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
@RequestMapping("habilidad/")
@CrossOrigin(origins = "https://portfolio-frontend-nicolas.web.app")
public class CHabilidad {

    @Autowired
    private SHabilidad habiServ;
    
    @GetMapping ("lista")
    @ResponseBody
    public List<Habilidad> verHabilidades () {
        return habiServ.verHabilidades();
    }
    
    @GetMapping ("ver/{id}")
    @ResponseBody
    public Habilidad verHabilidad (@PathVariable int id) {
        return habiServ.buscarHabilidad(id);
    }
            
    @PostMapping ("crear")
    public String agregarHabilidad (@RequestBody Habilidad habi) {
        habiServ.crearHabilidad(habi);
        return "La habilidad fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("borrar/{id}")
    public String borrarHabilidad (@PathVariable int id){
        habiServ.borrarHabilidad(id);
        return "La habilidad fue borrada correctamente";
    }
    
    
    
    @PutMapping ("editar/{id}")
    public String updateHabilidad (@RequestBody Habilidad habi) {
        habiServ.editarHabilidad(habi);
        return "La habilidad fue editada correctamente";
    }  
}
