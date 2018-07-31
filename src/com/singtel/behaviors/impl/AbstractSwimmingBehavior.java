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
public class AbstractSwimmingBehavior implements SwimmingBehavior {

    public AbstractSwimmingBehavior(boolean canSwim) {
        this.canSwim = canSwim;
    }

    private boolean canSwim;

    @Override
    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    @Override
    public void swim() {
        if (isCanSwim()) {
            System.out.println("I can swim");
        } else {
            System.out.println("I Cannot swim");
        }

    }

    @Override
    public void canSwim(boolean canSwim) {
        this.setCanSwim(canSwim);
    }

}
