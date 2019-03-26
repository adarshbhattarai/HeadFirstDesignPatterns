package com.headfirst.patterns.observer_pattern.solution;

/**
 * Created by adarshbhattarai on 3/25/19.
 */
public class CurrentConditionsDisplay implements Observers,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature=temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
