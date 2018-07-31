/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.behaviors.impl;

import com.singtel.behaviors.SingingBehavior;

/**
 *
 * @author sraibole
 */
public class SweetSinging implements SingingBehavior{

    @Override
    public void sing() {
        System.out.println("I am singing very sweetly");
    }
    
}
