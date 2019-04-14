package com.headfirst.patterns.decoratorPattern.solution;

/**
 * Created by adarshbhattarai on 4/14/19.
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Soy(new Milk(beverage));
        System.out.println(beverage.getDescription() + " " + beverage.cost());
    }
}
