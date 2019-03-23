package com.headfirst.patterns.introStrategyPattern.illustration;

/**
 * Created by adarshbhattarai on 3/22/19.
 */
public abstract  class Duck {
    abstract void quack();

    void swim(){

        System.out.println("Duck  , I swim");
    }

    abstract void display();
    abstract void fly(); //by putting fly here flying ability is gone to all ducks, including those which shouldn't.

    //other duck methods
}
