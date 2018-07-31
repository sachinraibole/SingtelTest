/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.test;

import com.singtel.behaviors.impl.CluckSinging;
import com.singtel.behaviors.impl.LakeSwimming;
import com.singtel.behaviors.impl.LowFlying;
import com.singtel.behaviors.impl.NoFlying;
import com.singtel.behaviors.impl.QuackSinging;
import com.singtel.model.Bird;
import com.singtel.model.Chicken;
import com.singtel.model.Duck;

/**
 *
 * @author sraibole
 */
public class SolutionTest {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //We have now made Bird a abstract class.
        //Duck can fly and swim and says Quack, quack. 
        //Assumption is it cannot swim either.
        Bird duck = new Duck(); // programming to interface
        duck.setSingingBehavior(new QuackSinging());
        duck.setSwimmingBehavior(new LakeSwimming());
        duck.setFlyingBehavior(new LowFlying());
        System.out.println("Duck is acting now ");
        duck.doFlying();
        duck.doSinging();
        duck.doSwimming();
        
        //Chicken cannot fly and says Cluck, cluck. 
        //Assumption is it cannot swim either.
        Bird chicken = new Chicken();
        chicken.setSingingBehavior(new CluckSinging());
        chicken.setFlyingBehavior(new NoFlying());
        System.out.println("Chicken is acting now");
        chicken.doFlying();
        chicken.doSinging();
        chicken.doSwimming();
        
    }
    
}
