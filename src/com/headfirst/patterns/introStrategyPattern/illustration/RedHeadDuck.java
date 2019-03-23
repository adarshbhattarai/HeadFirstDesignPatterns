package com.headfirst.patterns.introStrategyPattern.illustration;

/**
 * Created by adarshbhattarai on 3/22/19.
 */
public class RedHeadDuck extends Duck {

    @Override
    void quack() {
        System.out.println("I quack RedHead");
    }

    void display(){

        System.out.println("Looks Like RedHead");
    }

    @Override
    void fly() {
        System.out.println("I fly");
    }
}
