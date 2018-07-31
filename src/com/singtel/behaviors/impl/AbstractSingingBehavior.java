/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.behaviors.impl;

import com.singtel.behaviors.SingingBehavior;

/**
 *
 * @author sachinraibole
 */
public class AbstractSingingBehavior implements SingingBehavior {

    private boolean canSing;
    private String sex;
    private String melody;
    private static String MALE = "Male";
    private static String FEMALE = "Female";

    public AbstractSingingBehavior(boolean canSing, String sex, String melody) {
        this.canSing = canSing;
        this.sex = sex;
        this.melody = melody;
    }

    public boolean isCanSing() {
        return canSing;
    }

    public void setCanSing(boolean canSing) {
        this.canSing = canSing;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMelody() {
        return melody;
    }

    public void setMelody(String melody) {
        this.melody = melody;
    }

    @Override
    public void sing() {
        if (isCanSing()) {
            System.out.println("I say " + getMelody());
        } else {
            System.out.println("Singing not supported");
        }

    }

    @Override
    public void canSing(boolean canSing) {
        this.setCanSing(canSing);
    }

}
