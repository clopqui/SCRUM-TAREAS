/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CMEPPS.listatareas.repository;

import com.CMEPPS.listatareas.model.Lista;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nacho
 */
public interface ListaRepository extends JpaRepository < Lista, Long > {
    List <Lista> findByUserName(String user);
 
}
