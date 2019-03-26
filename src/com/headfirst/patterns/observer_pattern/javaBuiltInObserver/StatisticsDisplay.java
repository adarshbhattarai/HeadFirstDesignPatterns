package com.headfirst.patterns.observer_pattern.javaBuiltInObserver;


import com.headfirst.patterns.observer_pattern.solution.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by adarshbhattarai on 3/25/19.
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataBuiltIn) {
            WeatherDataBuiltIn weatherData = (WeatherDataBuiltIn) o;
            this.temperature = weatherData.getTemparature();
            this.humidity = weatherData.getHumidity();
            this.pressure =weatherData.getPressure();
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics : " + temperature + "F degrees, "+humidity+"% humidity " +pressure+"Pa pressure");
    }
}
