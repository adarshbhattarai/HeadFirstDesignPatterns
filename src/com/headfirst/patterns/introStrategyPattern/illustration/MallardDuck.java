package com.headfirst.patterns.introStrategyPattern.illustration;

/**
 * Created by adarshbhattarai on 3/22/19.
 */
public class MallardDuck extends Duck {

    @Override
    void quack() {
        System.out.println("I quack MallardDuck");
    }

    void display(){

        System.out.println("Looks Mallard");
    }

    @Override
    void fly() {
        System.out.println("I Fly");
    }
}
