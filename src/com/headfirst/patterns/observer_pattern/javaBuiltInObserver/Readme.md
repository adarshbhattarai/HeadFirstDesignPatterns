How Java’s built-in Obser ver Pattern works

The built in Observer Pattern works a bit differently than the implementation that we used
on the Weather Station. The most obvious difference is that WeatherData (our subject)
now extends the Observable class and inherits the add, delete and notify Observer methods
(among a few others). Here’s how we use Java’s version:

For an Object to become an observer...
As usual, implement the Observer interface (this time the java.util.Observer
interface) and call addObserver() on any Observable object. Likewise, to remove
yourself as an observer just call deleteObserver()

For the Observable to send notifications...

First of all you need to be Observable by extending the java.util.Observable
superclass. From there it is a two step process:

You first must call the setChanged() method to signify
that the state has changed in your object
Then, call one of two notifyObservers() methods:
either notifyObservers() or notifyObservers(Object arg)

The setChanged() method is meant to give you more flexibility in how
you update observers by allowing you to optimize the notifications. For example, in our weather
station, imagine if our measurements were so sensitive that the temperature readings were
constantly fluctuating by a few tenths of a degree. That might cause the WeatherData object
to send out notifications constantly. Instead, we might want to send out notifications only if the
temperature changes more than half a degree and we could call setChanged() only after that
happened.