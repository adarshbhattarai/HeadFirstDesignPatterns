package com.headfirst.patterns.introStrategyPattern.solution;

/**
 * Created by adarshbhattarai on 3/23/19.
 */
public class Quack implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("I quack duck quacking");
    }
}
