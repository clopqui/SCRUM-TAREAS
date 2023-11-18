/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CMEPPS.listatareas.service;

import com.CMEPPS.listatareas.model.Lista;
import com.CMEPPS.listatareas.model.Todo;
import com.CMEPPS.listatareas.repository.ListaRepository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author nacho
 */
public class ListaService implements IListaService {

    @Override
    public List<Lista> getListasByUser(String user) {
        
        return ListaRepository
    }

    @Override
    public Optional<Lista> getListaById(long id) {
    }

    @Override
    public void updateLista(Lista lista) {
    }

    @Override
    public void addLista(List<Todo> Lista, int id, String UserName, String Name, String description) {
    }

    @Override
    public void deleteLista(long id) {
    }

    @Override
    public void saveLista(Lista lista) {
    }


    
}
