package com.headfirst.patterns.observer_pattern.illustration;

/**
 * Created by adarshbhattarai on 3/24/19.
 */
public abstract class WeatherData {

    abstract float getTemperature();
    abstract float getHumidity();
    abstract float getPressure();

    //weatherData knows how to get updated information from weather data object
    //This method is called whenever other datas are changed
    //We don’t know or care how this method is called; we just know that it is.

    /*
    *  What we know
    *  --------------
    *  We need to implement three display elements that
    use the weather data: a current conditions display, a
    statistics display and a forecast display. These displays
    must be updated each time WeatherDataBuiltIn has new
    measurements.
    *
    * */
    public void measurementChanged(){

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        //We update three displays(currentConditionsDisplay,statisticsDisplay,forecastDisplay) like this

       // currentConditionsDisplay.update(temp, humidity, pressure);
       // statisticsDisplay.update(temp, humidity, pressure);
       // forecastDisplay.update(temp, humidity, pressure);
        //After measurement Changed


    }


    //other methods
}
