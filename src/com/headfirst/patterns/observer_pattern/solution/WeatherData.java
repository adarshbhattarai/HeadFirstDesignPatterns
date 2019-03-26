package com.headfirst.patterns.observer_pattern.solution;

import java.util.ArrayList;

/**
 * Created by adarshbhattarai on 3/25/19.
 */
public class WeatherData implements Subject {

    ArrayList<Observers> observers;
    private float temparature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observers>();
    }
    @Override
    public void registerObserver(Observers observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observers observer) {
        if(observers.contains(observer))
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observers o : observers)
            o.update(temparature,humidity,pressure);
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temparature, float humidity, float pressure){

        this.pressure=pressure;
        this.temparature=temparature;
        this.humidity=humidity;
        measurementChanged();
    }
    //other methods
}
