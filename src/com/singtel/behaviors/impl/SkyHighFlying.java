/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.behaviors.impl;

import com.singtel.behaviors.FlyingBehavior;

/**
 *
 * @author sraibole
 */
public class SkyHighFlying implements FlyingBehavior{

    @Override
    public void fly() {
        System.out.println("I am flying very very high in the sky");
    }
    
}
