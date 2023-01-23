/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.pagina.portfolio.repository;

import com.pagina.portfolio.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Argentina Programa
 */

@Repository
public interface RPersona extends JpaRepository <Persona, Integer>{
    public List<Persona> findByEmailAndClave(String email, String clave);
    
}
