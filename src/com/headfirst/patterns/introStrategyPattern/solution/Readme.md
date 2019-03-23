We’d like to keep things flexible; after all, it was the inflexibility in
the duck behaviors that got us into trouble in the first place. And we
know that we want to assign behaviors to the instances of Duck. For
example, we might want to instantiate a new MallardDuck instance
and initialize it with a specific type of flying behavior. And while
we’re there, why not make sure that we can change the behavior of
a duck dynamically? In other words, we should include behavior
setter methods in the Duck classes so that we can, say, change the
MallardDuck’s fl ying behavior at runtime.
Given these goals, let’s look at our second design principle:


Design Principle
Program to an interface, not an
implementation.



This is in contrast to the way we were doing things before, where
a behavior either came from a concrete implementation in the
superclass Duck, or by providing a specialized implementation in the
subclass itself. In both cases we were relying on an implementation. We
were locked into using that specific implementation and there was no
room for changing out the behavior (other than writing more code).


From now on, the Duck
behaviors will live in a
separate class— a class that
implements a particular
behavior interface.
That way, the Duck classes
won’t need to know any of
the implementation details
for their own behaviors.

        Flybehaviour

flywithWings        flyNoWay
    fly()               fly()


   Question:
    I don’t see why you have to
    use an interface for FlyBehavior.
    You can do the same thing with an
    abstract superclass. Isn’t the
    whole point to use polymorphism?



“Program to an interface” really means
“Program to a supertype.”

The word interface is overloaded here. There’s the concept of
interface, but there’s also the Java construct interface. You
can program to an interface, without having to actually use a
Java interface.

The point is to exploit polymorphism by
programming to a supertype so that the actual runtime object
isn’t locked into the code.

For Example
class Animal: makesSound()  // can be an interface or abstract class

class Dog < Animal : makeSound(){ bark(); } , bark();

class Cat < Animal : makeSound() {meow(); }, meow();

Here Programming to Implementation is
Dog d= new Dog(); d.bark();

Programming to Interface is
Animal d= new Dog();
d.makeSound();

Even better , rather than instantiating dog, assign concrete implementation object at runtime.

Animal d = getAnimal();
d.makeSound();  // No matter that the type of animal is, it will make some sound accordingly


Using our new design, what would you do if you needed to
add rocket-powered flying to the SimUDuck app?

==> Create a FlyRocketPowered class
    that implements the FlyBehavior
    interface.

The key is that a Duck will now delegate its flying
and quacking behavior, instead of using quacking and
flying methods defined in the Duck class (or subclass).



First we’ll add two instance variables to the Duck class called fl yBehavior and
quackBehavior, that are declared as the interface type (not a concrete class implementation
type). Each duck object will set these variables polymorphically to reference the specifi c
behavior type it would like at runtime (FlyWithWings, Squeak, etc.).

We’ll also remove the fly() and quack() methods from the Duck class (and any subclasses)
because we’ve moved this behavior out into the FlyBehavior and QuackBehavior classes.
We’ll replace fly() and quack() in the Duck class with two similar methods, called
performFly() and performQuack();

Design Principle
Favor composition over inheritance

The HAS-A relationship : each duck
has a FlyBehavior and a QuackBehavior to which it
delegates flying and quacking.

When you put two classes together like this you’re using
composition. Instead of inheriting their behavior, the
ducks get their behavior by being composed with the right
behavior object.