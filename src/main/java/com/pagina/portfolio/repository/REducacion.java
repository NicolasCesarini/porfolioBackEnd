/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pagina.portfolio.repository;

import com.pagina.portfolio.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Argentina Programa
 */

@Repository
public interface REducacion extends JpaRepository <Educacion, Integer>{
    
}
