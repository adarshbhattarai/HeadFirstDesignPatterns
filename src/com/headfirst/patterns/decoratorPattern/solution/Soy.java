package com.headfirst.patterns.decoratorPattern.solution;

/**
 * Created by adarshbhattarai on 4/14/19.
 */
public class Soy extends  CondimentDecorator {

    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage =beverage;
    }
    @Override
    float cost() {
        return (float) (beverage.cost() + .5);
    }

    @Override
    String getDescription() {

        return beverage.getDescription() + ", Soy ";
    }
}
