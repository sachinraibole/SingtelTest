/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.model;

/**
 *
 * @author sachinraibole
 */
public class Fish extends Animal{
    private String size;
    private String color;
    private boolean makesJokes;
    private boolean eatsOtherFishes;

    public Fish(String size, String color, boolean makesJokes, boolean eatsOtherFishes) {
        super();
        this.size = size;
        this.color = color;
        this.makesJokes = makesJokes;
        this.eatsOtherFishes = eatsOtherFishes;
        System.out.println("Creating fish with size - "+ this.size + " , color - " + this.color);
    }
    
    public Fish() {
        super();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMakesJokes() {
        return makesJokes;
    }

    public void setMakesJokes(boolean makesJokes) {
        this.makesJokes = makesJokes;
    }

    public boolean isEatsOtherFishes() {
        return eatsOtherFishes;
    }

    public void setEatsOtherFishes(boolean eatsOtherFishes) {
        this.eatsOtherFishes = eatsOtherFishes;
    }
    
    
}
