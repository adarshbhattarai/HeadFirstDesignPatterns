Let's say we have a bevarage class. (Designing a Coffee App)


Bevarage has a description and has a cost.

HouseBlend, DarkRoast, Decaf and Espresso are all bevarage

 What if we want a some condiments on top of it,
 should we create new class have cost for each class eg: Decaf with whip cream and sugar , Espresso with Mocha .... etc

 BOOM!! Class Explosion


 Now what if we calculate the beverage cost  like hasMocha , hasSoy, hasWhip()...
 All these methods go to all other bevarageas well as illustrated .

All we are doing here is  checking if beberage has any condiments and increasing the price.
What happens if we want double of anything , like doubleMocha???

This is a bad design , A lot of modifications is required when a new condiments is to be added .
Price change.
Unwanted methods are just getting added in all class files.


So, Our Design Principle is

Design Principle:

Classes should be open
for extension, but closed for
modification.

So we will see the Decorator Pattern