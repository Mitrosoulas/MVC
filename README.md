# MVC
Simple Model View Controller Pattern example with Java 

This is an example of the Model View Controller pattern implemented with Java. 
It contains 3 Classes.

#Car:
This is our Model. It contains 2 fields. Chassis: chassis code and Model: car model name (not to be confused with MVC model)
It also contains a setter and a getter for each field.

#CarView:
This is our View. It contains a simple trivial method ,printCarDetails, to print the details of our Model to the console.

#CarController:
And last but not least this is our Controller. It contains 2 fields Model(Car) and View(CarView).
It also has a setter and a getter for the chassis and model name of our model(Car) and a simple constructor.
Finally, it has an updateView method which updates our current View. (In this trivial case, it just prints the current Car details.)


#Test:
Just a simple test to see our MVC Pattern in action!
We create an instance of a Model a View and a Controller. We call the updateView() function of the Controller, change the model details and call it again. 
