/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.model;

import com.singtel.behaviors.FlyingBehavior;
import com.singtel.behaviors.SingingBehavior;
import com.singtel.behaviors.impl.SkyHighFlying;
import com.singtel.behaviors.impl.SweetSinging;

/**
 *
 * @author sraibole
 */
public class Bird extends Animal{
    // DESIGN PRINCIPAL - Program to an interface, not an implementation.
    // DESIGN PRINCIPAL - Favor composition over inheritance.
    private FlyingBehavior flyingBehavior;
    private SingingBehavior singingBehavior;

    // The behaviors can be injected at runtime. Keeping it simple in this solution.
    public Bird() {
        this.flyingBehavior = new SkyHighFlying();
        this.singingBehavior = new SweetSinging();
    }

    public FlyingBehavior getFlyingBehavior() {
        return flyingBehavior;
    }

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public SingingBehavior getSingingBehavior() {
        return singingBehavior;
    }

    public void setSingingBehavior(SingingBehavior singingBehavior) {
        this.singingBehavior = singingBehavior;
    }
    
    public void doFlying(){
        flyingBehavior.fly();
    }
    
    public void doSinging(){
        singingBehavior.sing();
    }
    
//  OLD CODE       
//    public void fly(){
//        System.out.println("I am flying");
//    }
//    
//    public void sing(){
//        System.out.println("I am Singing");
//    }
}
