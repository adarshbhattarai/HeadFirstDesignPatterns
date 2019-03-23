package com.headfirst.patterns.introStrategyPattern.illustration;

/**
 * Created by adarshbhattarai on 3/22/19.
 */
public class DecoyDuck extends Duck {
    @Override
    void display() {
        System.out.println("Decoy Duck ");
    }

    @Override
    void quack() {
        //override do nothing
    }

    @Override
    void fly() {
        //override do nothing
    }

}
