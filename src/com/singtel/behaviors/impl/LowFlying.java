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
public class LowFlying implements FlyingBehavior{

    @Override
    public void fly() {
        System.out.println("I fly low over the ground");
    }
    
}
