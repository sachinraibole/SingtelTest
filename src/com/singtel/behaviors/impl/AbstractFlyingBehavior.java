/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.behaviors.impl;

import com.singtel.behaviors.FlyingBehavior;

/**
 *
 * @author sachinraibole
 */
public abstract class AbstractFlyingBehavior implements FlyingBehavior{

    public AbstractFlyingBehavior(boolean canFly) {
        this.canFly = canFly;
    }
    
    private boolean canFly;
    
    @Override
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    
    //All classed to implement this method
    @Override
    public void fly() {
        if(isCanFly()){
            System.out.println("I Can fly");
        }else{
            System.out.println("I Cannot fly");
        }
    }

    @Override
    public void canFly(boolean canFly) {
        this.setCanFly(canFly);
    }
    
}
