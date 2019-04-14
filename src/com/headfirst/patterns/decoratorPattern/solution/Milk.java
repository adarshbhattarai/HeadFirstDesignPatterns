package com.headfirst.patterns.decoratorPattern.solution;

/**
 * Created by adarshbhattarai on 4/14/19.
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage =beverage;
    }
    @Override
    float cost() {
        return (float) (beverage.cost() + .2);
    }

    @Override
    String getDescription() {

        return beverage.getDescription() + ", Milk ";
    }
}
