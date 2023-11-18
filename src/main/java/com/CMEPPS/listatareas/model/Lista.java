/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CMEPPS.listatareas.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author nacho
 */
@Entity
@Table(name = "Lista")
public class Lista {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private List<Todo> Lista;
    private String UserName;
    private String Name;
    private String description;

    public Lista() {
        super();
    }

    public Lista(List<Todo> Lista, int id, String UserName, String Name, String description) {
        this.Lista = Lista;
        this.id = id;
        this.UserName = UserName;
        this.Name = Name;
        this.description = description;
    }

    public List<Todo> getLista() {
        return Lista;
    }

    public void setLista(List<Todo> Lista) {
        this.Lista = Lista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
