package com.headfirst.patterns.observer_pattern.solution;

import com.headfirst.patterns.observer_pattern.javaBuiltInObserver.ForcastDisplay;
import com.headfirst.patterns.observer_pattern.javaBuiltInObserver.GeneralDisplay;
import com.headfirst.patterns.observer_pattern.javaBuiltInObserver.WeatherDataBuiltIn;

/**
 * Created by adarshbhattarai on 3/25/19.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);


        WeatherDataBuiltIn weatherDataBuiltIn = new WeatherDataBuiltIn();
        ForcastDisplay fd = new ForcastDisplay(weatherDataBuiltIn);
        GeneralDisplay gd = new GeneralDisplay(weatherDataBuiltIn);
        com.headfirst.patterns.observer_pattern.javaBuiltInObserver.StatisticsDisplay sd = new com.headfirst.patterns.observer_pattern.javaBuiltInObserver.StatisticsDisplay(weatherDataBuiltIn);


        weatherDataBuiltIn.setMeasurements(80, 65, 30.4f);

    }
}
