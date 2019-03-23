package com.headfirst.patterns.introStrategyPattern.solution;

/**
 * Created by adarshbhattarai on 3/23/19.
 */
public class FlyWithWings implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("I fly with Wings ");
    }
}
