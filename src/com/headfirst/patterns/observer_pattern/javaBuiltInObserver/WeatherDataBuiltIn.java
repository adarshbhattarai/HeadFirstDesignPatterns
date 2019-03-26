package com.headfirst.patterns.observer_pattern.javaBuiltInObserver;

import com.headfirst.patterns.observer_pattern.solution.Observers;

import java.util.Observable;

/**
 * Created by adarshbhattarai on 3/25/19.
 */
public class WeatherDataBuiltIn extends Observable {

    private float temparature;
    private float humidity;
    private float pressure;

    public WeatherDataBuiltIn(){

    }

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temparature, float humidity, float pressure){

        this.pressure=pressure;
        this.temparature=temparature;
        this.humidity=humidity;
        measurementChanged();
    }

    public float getTemparature(){
        return temparature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
