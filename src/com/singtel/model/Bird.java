/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.model;

import com.singtel.behaviors.FlyingBehavior;
import com.singtel.behaviors.SingingBehavior;
import com.singtel.behaviors.SwimmingBehavior;
import com.singtel.behaviors.impl.NoFlying;
import com.singtel.behaviors.impl.NoSinging;
import com.singtel.behaviors.impl.NoSwimming;

/**
 *
 * @author sraibole
 */
public abstract class Bird extends Animal{
    // DESIGN PRINCIPAL - Program to an interface, not an implementation.
    // DESIGN PRINCIPAL - Favor composition over inheritance.
    private FlyingBehavior flyingBehavior;
    private SingingBehavior singingBehavior;
    private SwimmingBehavior swimmingBehavior;

    // The behaviors can be injected at runtime. Keeping it simple in this solution.
    public Bird() {
        this.flyingBehavior = new NoFlying();
        this.singingBehavior = new NoSinging();
        this.swimmingBehavior = new NoSwimming();
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
    
//  OLD CODE       
//    public void fly(){
//        System.out.println("I am flying");
//    }
//    
//    public void sing(){
//        System.out.println("I am Singing");
//    }
}
