package com.demo_2.lib;

public class class_object_lec {
//    class className{
//        // fields - states - attributes : store data
//        // methods - functionalities - behaviour : prefer operations
//    }

    public static void main(String[] args) {
        // Object : is an instance of a class
        // class : is an blueprint or template

//        Syntax:
//        className object - new className();
//        Cars redCar = new Cars();
//        redCar.speed = 150;
//        redCar.year = 2022;
//        redCar.model = "BMW M5";
//
//        System.out.println("The model of the car is: " + redCar.model);
//        System.out.println("The year of the car is: " + redCar.year);
//
//        redCar.accelerate();
//        redCar.accelerate();
//        redCar.brake();

        System.out.println("---------------------------------------");

//        // Creating an object with the parameterized constructor
//        Cars blueCar = new Cars("Lamborghini Urus", 150, 2023);
//
//        System.out.println("The model of the car is: " + blueCar.model);
//        System.out.println("The year of the car is: " + blueCar.year);
//
//        blueCar.year = 2025;
//        blueCar.accelerate();
//        blueCar.accelerate();
//        blueCar.brake();
//        System.out.println("---------------------------------------");

//        // 47: Inheritance 48: "this" keyword
//        carChild myCar = new carChild("Mercedes");
//        myCar.start();
//        myCar.honk();
//        myCar.stop();

//        // 50: Polymorphism
//        Vehicle v1 = new carChild("Bayerische Motoren Werke (BMW)");
//        Vehicle v2 = new Truck(8);
//        // so her what happens is that polymorphism is used here
//        // helps to keep the code DRY (Don't Repeat Yourself)
//        // that is carChild can run its own needed way of code
//        // and also Truck can run its own needed way of code
//        // thus is the polymorphism
//
//        v1.start();
//        System.out.println("---------------------------------------");
//        v2.start();
//

//        // 51: Abstraction
//        // Abstraction is the process of hiding the implementation details and showing only the functionality to the user.
//        Vehicle v1 = new carChild("LAMBORGHINI");
//        Vehicle v2 = new Truck(12);
//
//        // also her we can use polymorphism concept for car and truck
//        v1.start();
//        v1.brake();
//        // v1.honk();
//        System.out.println("---------------------------------------");
//        v2.start();
//        v2.brake();

        // 52: Interfaces
        // Interfaces are used to define a contract that a class must adhere to.
        // An interface is like a contract or a set of rules that a class can promise to follow.
        //It defines a set of methods, signatures, methods without implementations that any class implementing
        //the interface must provide.
        //An interface provides a way to achieve abstraction and define a common behavior that multiple classes
        //can share in the vehicle class.

        vehicle_Interface v1 = new car_Interface("LAMBORGHINI");
        vehicle_Interface v2 = new Truck("VOLVO");

        v1.startEngine();
        v1.stopEngine();
        v1.accelerate();
        v1.brake();
        System.out.println("---------------------------------------");
        v2.startEngine();
        v2.stopEngine();
        v2.accelerate();
        v2.brake();

        System.out.println("---------------------------------------");
        // Interface Example
        // Calculate the Area of:
        // 1.Circle
        // 2.Rectangle
        // 3.Triangle
        // 4.Square
        // Using Interface to calculate the area of the above shapes
// Solution:
        // 1.Circle
        Circle c = new Circle(5);

        // 2.Rectangle
        rectangle r = new rectangle(5, 10);

        // 3.Triangle
        triangle t = new triangle(5, 10);

        // 4.Square
        square s = new square(5);

        System.out.println(c.Area());
        System.out.println(c.perimeter());
        System.out.println("---------------------------------------");

        System.out.println(r.Area());
        System.out.println(r.perimeter());
        System.out.println("---------------------------------------");

        System.out.println(t.Area());
        System.out.println(t.perimeter());
        System.out.println("---------------------------------------");

        System.out.println(s.Area());
        System.out.println(s.perimeter());
        System.out.println("---------------------------------------");

    }
}
