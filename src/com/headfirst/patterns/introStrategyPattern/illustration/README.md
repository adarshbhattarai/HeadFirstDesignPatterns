 1. Duck
 ---------

        -Duck Quacks, displays and swim
        2.Now we need to add fly() in Duck
         but if we add fly in duck. some ducks don't fly, lets say rubber duck extending duck.
         to overcome let's say we override fly behavior and do nothing in rubberduck.
        now what happens if wooden decoy ducks is added , they dont fly or quack

        Problem with this approach is code is duplicated
        Runtime behavior changes are difficult
          hard to gain knowledge of duck behavior
         Changes can unintentionally affect other ducks.

        ??How about implementing interface?
        Create flyable and Quackable Interface, and remove fly() and quack from Duck Class, add
        fly() to flyable and quack() to quackable interface., so that only some can fly and quack.
        This is again a bad idea.
        Code duplication, what if we want to make little change in flying behavior.
        This only solves a part of the problem
        What if we need flying rubberduck.


 whenever you need to modify a behavior, you’re forced to
track down and change it in all the different subclasses where that
behavior is defined, probably introducing new bugs along the way!


        Design Principle
        ---------------
        Identify the aspects of your
        application that vary and separate
        them from what stays the same.

        Here’s another way to think about this principle: take the parts
        that vary and encapsulate them, so that later you can
        alter or extend the parts that vary without affecting
        those that don’t.

------------------------------------------
------------------------------------------

We know that fly() and quack() are the parts of the
Duck class that vary across ducks.

To separate these behaviors from the Duck class, we’ll
pull both methods out of the Duck class and create a
new set of classes to represent each behavior.

FLying and Quacking each gets to implement its own behavior/s. Implementation in solution pack.