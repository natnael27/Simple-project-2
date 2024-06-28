# Using polymorphism and inheritance in java
This code splits the Shape and Main classes into separate files, Shape.java and Main.javarespectively. You can compile and run the Main.java file to execute the program.

In this program, we have an abstract Shape class with an abstract method displayShapeName. This method is meant to be overridden by its subclasses. 
The Rectangle, Square, and Circle classes inherit from the Shape class and provide their own implementations of the display ShapeName method.

In the Main class, we create an array of Shape objects and assign instances of the subclasses (Rectangle, Square, and Circle) to the elements of the array. 
The array allows us to store objects of different shapes in a polymorphic way.

We then use a for-each loop to iterate over the array of shapes. Within each iteration, we call the displayShapeName method on the current shape object. 
This invokes the appropriate method implementation based on the actual type of the object.
