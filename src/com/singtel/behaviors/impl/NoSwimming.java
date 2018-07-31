/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.behaviors.impl;

import com.singtel.behaviors.SwimmingBehavior;

/**
 *
 * @author sachinraibole
 */
public class NoSwimming implements SwimmingBehavior{

    @Override
    public void swim() {
        System.out.println("I Cannnot swim");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
