package com.headfirst.patterns.observer_pattern.solution;

/**
 * Created by adarshbhattarai on 3/25/19.
 */
public class ForecastDisplay implements Observers,DisplayElement {

    Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecasted Weather : " + temperature + "F degrees, "+humidity+"% humidity " +pressure+"Pa pressure");

    }
}
