/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pagina.portfolio.controller;

import com.pagina.portfolio.entity.Persona;
import com.pagina.portfolio.service.SPersona;
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
@RequestMapping("persona/")
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {

    @Autowired
    private SPersona persoServ;
    
    @GetMapping ("lista")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();
    }
    
    @GetMapping ("ver/{id}")
    @ResponseBody
    public Persona verPersona (@PathVariable int id) {
        return persoServ.buscarPersona(id);
    }
            
    @PostMapping ("crear")
    public String agregarPersona (@RequestBody Persona perso) {
        persoServ.crearPersona(perso);
        return "La persona fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("borrar/{id}")
    public String borrarPersona (@PathVariable int id){
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    }
    
    
    
    @PutMapping ("editar/{id}")
    public String updatePersona (@RequestBody Persona perso) {
        persoServ.editarPersona(perso);
        return "La persona fue editada correctamente";
    }
    
    //login
    @PostMapping ("autentication/login")
    public Persona loginPersona(@RequestBody Persona perso) {
        return persoServ.loginPersona(perso.getEmail(), perso.getClave());
    }
    
}
