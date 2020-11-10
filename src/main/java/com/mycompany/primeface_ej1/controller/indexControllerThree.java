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
@Named(value = "indexControllerThree")
@RequestScoped
public class indexControllerThree {
    
    private String name;
    
    private String password;

    /**
     * Creates a new instance of indexControllerThree
     */
    public indexControllerThree() {
        System.out.println("Controladore login 3");
    }
    
    public void login(){
        
        System.out.println(name + " / " + password);
        
        loginService service = new loginService();
        Usuario usuario = service.login(name, password);
        FacesContext context = FacesContext.getCurrentInstance();
        
        System.out.println("Entrando..");
        if (usuario != null) {
            System.out.println("hay usuario");
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos correctos", "Iniciando como " + usuario.getRol() + ": " + usuario.getNombre() ));
            //context.addMessage(null, new FacesMessage("Datos correctos",  "Iniciando como " + usuario.getRol() + ": " + usuario.getNombre() ) );
        } else {
            System.out.println("no hay usuario");
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
