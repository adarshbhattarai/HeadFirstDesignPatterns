package com.headfirst.patterns.introStrategyPattern.solution;

/**
 * Created by adarshbhattarai on 3/23/19.
 */
public class FlyNoWay implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("I do not fly :( ");
    }
}
