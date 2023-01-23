/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.controller;

import com.pagina.portfolio.entity.Proyecto;
import com.pagina.portfolio.service.SProyecto;
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
@RequestMapping("proyecto/")
@CrossOrigin(origins = "https://portfolio-frontend-nicolas.web.app")
public class CProyecto {
    @Autowired
    private SProyecto proyeServ;
    
    @GetMapping ("lista")
    @ResponseBody
    public List<Proyecto> verProyectos () {
        return proyeServ.verProyectos();
    }
    
    @GetMapping ("ver/{id}")
    @ResponseBody
    public Proyecto verProyecto (@PathVariable int id) {
        return proyeServ.buscarProyecto(id);
    }
            
    @PostMapping ("crear")
    public String agregarProyecto (@RequestBody Proyecto proye) {
        proyeServ.crearProyecto(proye);
        return "La proyelidad fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("borrar/{id}")
    public String borrarProyecto (@PathVariable int id){
        proyeServ.borrarProyecto(id);
        return "La proyelidad fue borrada correctamente";
    }
    
    
    
    @PutMapping ("editar/{id}")
    public String updateProyecto (@RequestBody Proyecto proye) {
        proyeServ.editarProyecto(proye);
        return "La proyelidad fue editada correctamente";
    }  
}
