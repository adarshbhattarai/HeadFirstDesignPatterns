package com.headfirst.patterns.decoratorPattern.solution;

import com.headfirst.patterns.decoratorPattern.solution.Beverage;

/**
 * Created by adarshbhattarai on 4/14/19.
 */
public class Espresso extends Beverage {


    @Override
    float cost() {
        return 2;
    }

    @Override
    String getDescription() {
        return "Espresso";
    }
}
