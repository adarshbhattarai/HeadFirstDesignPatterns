package com.headfirst.patterns.decoratorPattern.solution;

/**
 * Created by adarshbhattarai on 4/14/19.
 */
public class Whip extends  CondimentDecorator {

    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage =beverage;
    }
    @Override
    float cost() {
        return (float) (beverage.cost() + .1);
    }

    @Override
    String getDescription() {

        return beverage.getDescription() + ", Whip ";
    }
}


