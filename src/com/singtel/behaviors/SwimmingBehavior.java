/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.behaviors;

/**
 *
 * @author sachinraibole
 */
public interface SwimmingBehavior {
    boolean isCanSwim();
    void swim();
    void canSwim(boolean canSwim);
}
