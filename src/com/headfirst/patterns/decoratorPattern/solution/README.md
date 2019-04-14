After facing all those problems(class explosions, rigid designs , adding functionality to base class that is not appropriate
for subclass) as shown in illustration.

We will use decorator pattern.

We will start with bevarage and decorate it with condiments at runtime.

The Decorator Pattern attaches additional
responsibilities to an object dynamically.
Decorators provide a flexible alternative to
subclassing for extending functionality.

Here we create a decorator wrapper  and other addons (condiments) will extend it.
 And in runtime we inject the type of decorator we want and eventually calulating the price .

 The decorated has Beverage and is a Beverage.(both inheritance and Composition)


Here Condiment Decorator is our decorator  and Milk , Soy, Whip and Mocha are its sub classes.

Now each decorator has a bevarage. and is also a beverage, So, each time we add a new condiments. we simply passin
the type of bevarage we need to add. and cost is calulated dynamically.
