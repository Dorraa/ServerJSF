/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TP6.ManagedBeans;

import javax.annotation.ManagedBean;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author dorra
 */
@ManagedBean
@RequestScoped
public class BonjourBean {

    private String nom;
    /**
     * Creates a new instance of BonjourBean
     */
    public BonjourBean() {
        
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String Bienvenue(){return "Bienvenue";}
    
}
