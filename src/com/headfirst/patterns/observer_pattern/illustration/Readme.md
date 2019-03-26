Weather Monitoring Application
------------------------------

We have
1) Weather Station (The device that actually acquires Weather Data)
    i)Humidity Sensor device
    ii)Temperature Sensor Device
    iii)Pressure Sensor Device

2) Weather Data Object (This track the data coming from Weather Station and updates the Display)

3) The Display (This shows User the current Weather condition)

                            pulls data    |                             Displays
    Weather Station    <------------------|----- Weather Data Object -------------------> Display Device
    H.S.D ,  T.S.D , P.S.D                |
       OutSide Source                     |   Our Implementation


    So we have a source file Weather Data


What we need beside the things (getter and measurement changed )in WeatherData,

    i)
    We need to implement three display elements that
    use the weather data: a current conditions display, a
    statistics display and a forecast display. These displays
    must be updated each time WeatherData has new
    measurements.

    ii)
    The system must be expandable—other developers
    can create new custom display elements and users
    can add or remove as many display elements as they
    want to the application. Currently, we know about
    only the initial three display types (current conditions,
    statistics and forecast).


Based on current implementation inside measurementChanged() and weather data. The following are the design issues we faced.

1) We are coding to concrete
   implementations, not interfaces.
2) For every new display element we need
   to alter code.
3) We have no way to add (or remove)
   display elements at run time.
4) We haven’t encapsulated the part that
   changes.

currentConditionsDisplay.update(temp, humidity, pressure);-|
statisticsDisplay.update(temp, humidity, pressure);        | <--- Area of change we need to encapsulate this
forecastDisplay.update(temp, humidity, pressure);         -|
----------------
    ^
    |
Concrete Implementation, we have no way to add or remove other display elements without making  change to program


Then comes the observer pattern to rescue such.
In Newspaper subscription
Newspaper Published newspaper, Subscriber receive them, Subscribers can add or remove themself.


Publishers + Subscribers = Observer Pattern.

We call publishers the subject and subscribers the observers.

When Data in subject are changed, the observers are notified.
Observers are registered with subject to receive update when the subject change.,Observers can remove/add themself.


