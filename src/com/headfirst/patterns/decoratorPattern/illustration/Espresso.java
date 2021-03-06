package com.headfirst.patterns.decoratorPattern.illustration;

/**
 * Created by adarshbhattarai on 4/14/19.
 */
public class Espresso extends Beverage {


    @Override
    float cost() {
        float cost =1;
        if(hasMilk)  cost+=.1;
        if(hasSoy) cost+=.2;
        if(hasWhip) cost+=.5;
        if(hasMocha) cost+=.7;
        return cost;
    }
}
