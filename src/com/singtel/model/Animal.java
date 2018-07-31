/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.model;

import com.singtel.behaviors.FlyingBehavior;
import com.singtel.behaviors.SingingBehavior;
import com.singtel.behaviors.SwimmingBehavior;
import com.singtel.behaviors.impl.FlyingImpl;
import com.singtel.behaviors.impl.SingingImpl;
import com.singtel.behaviors.impl.SwimmingImpl;

/**
 *
 * @author sraibole
 */
public abstract class Animal {
    // DESIGN PRINCIPAL - Program to an interface, not an implementation.
    // DESIGN PRINCIPAL - Favor composition over inheritance.
    private FlyingBehavior flyingBehavior;
    private SingingBehavior singingBehavior;
    private SwimmingBehavior swimmingBehavior;

    private Animal companion;

    public Animal() {
        this.flyingBehavior = new FlyingImpl(false);
        this.singingBehavior = new SingingImpl(false,null,null);
        this.swimmingBehavior = new SwimmingImpl(false);
    }
    
    public Animal getCompanion() {
        return companion;
    }

    public void setCompanion(Animal companion) {
        this.companion = companion;
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

    public SwimmingBehavior getSwimmingBehavior() {
        return swimmingBehavior;
    }

    public void setSwimmingBehavior(SwimmingBehavior swimmingBehavior) {
        this.swimmingBehavior = swimmingBehavior;
    }
    
    public void doFlying(){
        flyingBehavior.fly();
    }
    
    public void doSinging(){
        singingBehavior.sing();
    }
    
     public void doSwimming(){
        swimmingBehavior.swim();
    }
    
//    public void walk() {
//        System.out.println("I am walking");
//    }

}
