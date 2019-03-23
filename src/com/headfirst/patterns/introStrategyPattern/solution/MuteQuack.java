package com.headfirst.patterns.introStrategyPattern.solution;

/**
 * Created by adarshbhattarai on 3/23/19.
 */
public class MuteQuack implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("I am mute");
    }
}
