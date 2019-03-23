package com.headfirst.patterns.introStrategyPattern.illustration;

/**
 * Created by adarshbhattarai on 3/22/19.
 */
public class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("I am Rubber DUck");
    }

    void fly(){
        //Idea to implement nothing.
    }

    void quack(){

        System.out.println("RubberDuck:: I squeak");
    }
}
