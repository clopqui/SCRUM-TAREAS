/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CMEPPS.listatareas.service;

import com.CMEPPS.listatareas.model.Lista;
import com.CMEPPS.listatareas.model.Todo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author nacho
 */
public interface IListaService {

    /**
     *
     * @param user
     * @return
     */
    List<Lista>getListasByUser(String user);

    Optional <Lista> getListaById(long id);

    void updateLista(Lista lista);

    void addLista(List<Todo> Lista, int id, String UserName, String Name, String description);

    void deleteLista(long id);

    void saveLista(Lista lista);

}
