package com.headfirst.patterns.introStrategyPattern;

import com.headfirst.patterns.introStrategyPattern.solution.*;

/**
 * Created by adarshbhattarai on 3/22/19.
 */
public class SimUDuck {

    public static void main(String[] args) {

       Duck mallardDuck = new MallardDuck();
       mallardDuck.setFlyingBehaviour(new FlyWithWings());
       mallardDuck.setQuackingBehaviour(new Squeak());

       mallardDuck.performFly();
       mallardDuck.performQuack();

    }
}
