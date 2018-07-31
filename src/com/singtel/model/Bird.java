/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.model;

/**
 *
 * @author sraibole
 */
public abstract class Bird extends Animal {

    // The behaviors can be injected at runtime. Keeping it simple in this solution.
    public Bird() {
        super();
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
