package com.headfirst.patterns.observer_pattern.javaBuiltInObserver;

import com.headfirst.patterns.observer_pattern.solution.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by adarshbhattarai on 3/25/19.
 */
public class GeneralDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public GeneralDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {

        if(o instanceof WeatherDataBuiltIn) {
            WeatherDataBuiltIn weatherData = (WeatherDataBuiltIn) o;
            this.temperature = weatherData.getTemparature();
            this.humidity = weatherData.getHumidity();
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
