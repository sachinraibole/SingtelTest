/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.test;

import com.singtel.model.Bird;

/**
 *
 * @author sraibole
 */
public class SolutionTest {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bird bird = new Bird();
        // Did not move walk to a behavior, but this is a candidate which also can vary as per the implementation and so can be extracted out.
        bird.walk(); 
        // In the below code the behaviors injected into the Bird encapsulate 
        // the behavior and is interchangeable at runtime.
        bird.doFlying();
        bird.doSinging();
    }
    
}
