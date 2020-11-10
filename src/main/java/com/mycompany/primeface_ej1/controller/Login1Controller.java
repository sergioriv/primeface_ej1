/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeface_ej1.controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Sergio Rivera
 */
@Named(value = "login1Controller")
@RequestScoped
public class Login1Controller {

    private String name;
    
    private String password;

    /**
     * Creates a new instance of loginController
     */
    public Login1Controller() {
        
        
        
    }
    
    public void login(){
        
        loginService service = new loginService();
        Usuario usuario = service.login(name, password);
        FacesContext context = FacesContext.getCurrentInstance();
        
        if (usuario != null) {
            context.addMessage(null, new FacesMessage("Datos correctos",  "Iniciando como " + usuario.getRol() + ": " + usuario.getNombre() ) );
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Los datos no coinciden."));
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
