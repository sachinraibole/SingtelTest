/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.test;

import com.singtel.behaviors.impl.SingingImpl;
import com.singtel.behaviors.impl.FlyingImpl;
import com.singtel.behaviors.impl.SwimmingImpl;
import com.singtel.model.Animal;
import com.singtel.model.Bird;
import com.singtel.model.Butterfly;
import com.singtel.model.Chicken;
import com.singtel.model.ClownFish;
import com.singtel.model.Dolphin;
import com.singtel.model.Duck;
import com.singtel.model.Fish;
import com.singtel.model.Parrot;
import com.singtel.model.Shark;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        Bird duck = new Duck(); // programming to interface
        duck.setSingingBehavior(new SingingImpl(true, "Female", "Quack, quack"));
        duck.setSwimmingBehavior(new SwimmingImpl(true));
        duck.setFlyingBehavior(new FlyingImpl(true));
        System.out.println("Duck is acting now ");
        duck.doFlying();
        duck.doSinging();
        duck.doSwimming();

        //Chicken cannot fly and says Cluck, cluck. 
        //Assumption is it cannot swim either.
        Bird chicken = new Chicken();
        chicken.setSingingBehavior(new SingingImpl(true, "Female", "Cluck, cluck"));
        chicken.setSwimmingBehavior(new SwimmingImpl(true));
        chicken.setFlyingBehavior(new FlyingImpl(false));
        System.out.println("Chicken is acting now");
        chicken.doFlying();
        chicken.doSinging();
        chicken.doSwimming();

        //Solution 3
        //Creating a Rooster
        Bird rooster = new Chicken();
        rooster.setSingingBehavior(new SingingImpl(true, "Male", "Cock-a-doodle-doo"));
        rooster.setSwimmingBehavior(new SwimmingImpl(true));
        rooster.setFlyingBehavior(new FlyingImpl(false));
        System.out.println("Rooster is acting now");
        rooster.doFlying();
        rooster.doSinging();
        rooster.doSwimming();

        //Solution 4
        //We are injecting the roosters singing behavior in the parrot
        Bird parrot = new Parrot();
        parrot.setCompanion(rooster);
        parrot.setSingingBehavior(rooster.getSingingBehavior());
        parrot.setSwimmingBehavior(new SwimmingImpl(false));
        parrot.setFlyingBehavior(new FlyingImpl(true));
        System.out.println("Parret 1 is acting now");
        parrot.doFlying();
        parrot.doSinging();
        parrot.doSwimming();

        //Section B Modelling Fish, Shark, Clownfish and Dolphin
        System.out.println("Shark is swimming now");
        Fish shark = new Shark("Large", "Gray", false, true);
        shark.setSingingBehavior(new SingingImpl(false, null, null));
        shark.setSwimmingBehavior(new SwimmingImpl(true));
        shark.setFlyingBehavior(new FlyingImpl(false));
        shark.doFlying();
        shark.doSinging();
        shark.doSwimming();

        System.out.println("Clownfish is swimming now");
        Fish clownFish = new ClownFish("Small", "orange", true, false);
        clownFish.setSingingBehavior(new SingingImpl(false, null, null));
        clownFish.setSwimmingBehavior(new SwimmingImpl(true));
        clownFish.setFlyingBehavior(new FlyingImpl(false));
        clownFish.doFlying();
        clownFish.doSinging();
        clownFish.doSwimming();

        System.out.println("Dolphin is swimming now");
        Animal dolphin = new Dolphin();
        dolphin.setSingingBehavior(new SingingImpl(false, null, null));
        dolphin.setSwimmingBehavior(new SwimmingImpl(true));
        dolphin.setFlyingBehavior(new FlyingImpl(false));
        dolphin.doFlying();
        dolphin.doSinging();
        dolphin.doSwimming();

        //Section D - 1,2
        System.out.println("Butterfly born as a caterpillar");
        Butterfly butterfly = new Butterfly("caterpillar");
        butterfly.injectBehaviorBasedOnStageOfLife();
        butterfly.doFlying();
        System.out.println("Butterfly grown to a buttefly which can fly");
        butterfly.setStageOfLife("butterfly");
        butterfly.injectBehaviorBasedOnStageOfLife();
        butterfly.doFlying();

        //Section E - Please note that I have used a ArrayList instead of an array.
        //Please note this excludes butterfly. 
        //Also note that I would never name the methods isCanFly etc, 
        //they will be named properly. Its due to less amount of time.
        List<Animal> animals = new ArrayList();
        animals.add(duck);
        animals.add(chicken);
        animals.add(rooster);
        animals.add(parrot);
        animals.add(shark);
        animals.add(clownFish);
        animals.add(dolphin);

        List<Animal> flyingAnimals = animals.stream()
                .filter(animal -> animal.getFlyingBehavior().isCanFly())
                .collect(Collectors.toList());

        System.out.println("Flying animals " + flyingAnimals.size());

        List<Animal> singingAnimals = animals.stream()
                .filter(animal -> animal.getSingingBehavior().isCanSing())
                .collect(Collectors.toList());

        System.out.println("Singing animals " + singingAnimals.size());

        List<Animal> swimingAnimals = animals.stream()
                .filter(animal -> animal.getSwimmingBehavior().isCanSwim())
                .collect(Collectors.toList());

        System.out.println("Swimming animals " + swimingAnimals.size());
        System.out.println("Swimming animals " + swimingAnimals.toString());

    }

}
