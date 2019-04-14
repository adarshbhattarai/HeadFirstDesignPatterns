package com.headfirst.patterns.decoratorPattern.solution;

/**
 * Created by adarshbhattarai on 4/14/19.
 */
public class Mocha extends  CondimentDecorator {

    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage =beverage;
    }
    @Override
    float cost() {
        return (float) (beverage.cost() + .3);
    }

    @Override
    String getDescription() {

        return beverage.getDescription() + ", Mocha ";
    }
}
