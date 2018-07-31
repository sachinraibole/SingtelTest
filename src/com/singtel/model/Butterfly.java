/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.model;

import com.singtel.behaviors.impl.FlyingImpl;

/**
 *
 * @author sachinraibole
 */
public class Butterfly extends Animal {

    public Butterfly(String stageOfLife) {
        super();
        this.stageOfLife = stageOfLife;
    }

    private String stageOfLife;

    public String getStageOfLife() {
        return stageOfLife;
    }

    public void setStageOfLife(String stageOfLife) {
        this.stageOfLife = stageOfLife;
    }

    public void injectBehaviorBasedOnStageOfLife() {
        if (getStageOfLife().equalsIgnoreCase("butterfly")) {
            this.setFlyingBehavior(new FlyingImpl(true));
        } else {
            this.setFlyingBehavior(new FlyingImpl(false));
        }
    }

}
