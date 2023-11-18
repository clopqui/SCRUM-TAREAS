/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CMEPPS.listatareas.service;

import java.util.List;
import java.util.Optional;

import com.CMEPPS.listatareas.model.Todo;

public interface ITodoService {

    List < Todo > getTodosByUser(String user);

    Optional < Todo > getTodoById(long id);

    void updateTodo(Todo todo);

    void addTodo(long id, String UserName,String Name, String description, int duration, int priority, int idlist);

    void deleteTodo(long id);

    void saveTodo(Todo todo);
}
