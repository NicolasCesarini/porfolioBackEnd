/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.controller;

import com.pagina.portfolio.entity.Redes;
import com.pagina.portfolio.service.SRedes;
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
@RequestMapping("redes/")
@CrossOrigin(origins = "https://portfolio-frontend-nicolas.web.app")
public class CRedes {

    @Autowired
    private SRedes redServ;
    
    @GetMapping ("lista")
    @ResponseBody
    public List<Redes> verRedes () {
        return redServ.verRedes();
    }
    
    @GetMapping ("ver/{id}")
    @ResponseBody
    public Redes verRed (@PathVariable int id) {
        return redServ.buscarRed(id);
    }
            
    @PostMapping ("crear")
    public String agregarRed (@RequestBody Redes red) {
        redServ.crearRed(red);
        return "La red fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("borrar/{id}")
    public String borrarRed (@PathVariable int id){
        redServ.borrarRed(id);
        return "La red fue borrada correctamente";
    }
    
    
    
    @PutMapping ("editar/{id}")
    public String updateRed (@RequestBody Redes red) {
        redServ.editarRed(red);
        return "La redriencia fue editada correctamente";
    }
}