# Coffee Preparation Simulation in Java

This repository contains a simple Java application that simulates the process of making coffee. The application is structured into three classes: `Main`, `Coffee`, and `Recipe`.

## Classes

- `Main`: This is the entry point of the application. It creates a `Coffee` object and calls methods to simulate the process of making coffee. Any exceptions that occur during this process are caught and their messages are printed to the console.

- `Coffee`: This class extends the `Recipe` class. It inherits all the properties and methods of the `Recipe` class. The constructor of the `Coffee` class takes several parameters that represent the ingredients and equipment needed to make coffee.

- `Recipe`: This is an abstract class that defines the blueprint for a coffee recipe. It contains properties for the ingredients (coffee, sugar, water) and equipment (strainer, teapot, cup), as well as methods that simulate the steps of making coffee (`coffeeStrainer`, `hootWater`, `coffeeCoup`). These methods throw `NoSuchElementException` if the required ingredients or equipment are not available.

## Running the Application

To run the application, you need to have Java 17 installed on your machine. You can run the application by executing the `Main` class.

## Exception Handling

The application uses exception handling to deal with situations where the required ingredients or equipment are not available. In such cases, a `NoSuchElementException` is thrown with a message that describes the problem.

Please note that this is a simple simulation and does not interact with any real-world coffee making devices.

---- @..@<br />
--- (----)<br />
-- ( >__< )<br />
-- ^^ ~~ ^^<br />
