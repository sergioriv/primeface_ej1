/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeface_ej1.controller;

/**
 *
 * @author Sergio Rivera
 */
public class loginService {
    
    /**
     * Creates a new instance of loginService
     * 
     * 
     * ESTE SERIA EL MODELO, EL QUE SE COMUNICA CON LA BASE DE DATOS
     * @param name
     * @param password
     * @return Usuario
     */
    public Usuario login(String name, String password){
        
        if(name.equals("javier")){
            Usuario usuario = new Usuario("Javier","Leon","Estudiante");
           return usuario;
        } else {
            return null;
        }
    }
    
}
