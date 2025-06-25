package com.demo_2.lib;

public class Object_Oriented_Programming {
    public static void main(String[] args){
        sayHello();
        int x = add();
        System.out.println( x); // SUM of 20 and 30 is 50
        System.out.println("Sum of a and b is: "+ x);// Sum of a and b is: 50 x

        int y = sub();
        System.out.println("Subtraction of b and a is: "+ y); // Subtraction of b and a is: 80
        // OR
        System.out.println("Subtraction : b-a => 300-250 = "+ sub()); // Subtraction of b and a is: 80

        //Multiplication
        // method overloading example
        System.out.println("Multiplication of 2.5 x 2.5 = "+ mul(2.5,2.5));

//      Classes and Objects
//      class : is a blueprint for objects.
//      object : is an instance of a class.
//      Syntax of Object creation
//      className object =  new className();

    }
    // lesson 1 : Object Oriented Programming

    // Declaring a java Methods
//    returnType methodName(parameterType1 parameter1, parameterType2 parameter2, ...) {
//        // method body
//    }

    static void sayHello(){
        System.out.println("Hello World !");
    }

    // Return Type : returns to the caller.
    static int add(){
        int a = 20;
        int b = 30;
        int c = a + b;
        System.out.print("Sum of "+a+" and "+b+" is: ");
        return c;
    }

    static int sub(){
        int a = 250;
        int b = 300;
        // we can also return the value directly without storing it in a variable
        return b-a;
    }
    // lesson 2 : Methods Parameters
    static int mul(int x ,int y){
        return x*y;
    }
    // lesson 3 : Methods Overloading
    // Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
    static double mul(double x ,double y){
        return x*y;
    }

    // Object Oriented Programming (OOP) is a programming paradigm that relies on the concept of classes and objects.
    // It is used to structure a software program into simple, reusable pieces of code blueprints (usually called classes), which are used to create individual instances of objects.
    // There are four main principles of OOP:
    // 1. Encapsulation : Encapsulation is the mechanism that binds together code and the data it manipulates, and keeps both safe from outside interference and misuse.
    // 2. Inheritance : Inheritance is a mechanism wherein a new class is derived from an existing class. The derived class inherits features from the base class, adding new features to it.
    // 3. Polymorphism : Polymorphism is the ability of a variable, function or object to take on multiple forms. In other words, polymorphism allows you to define one interface and have multiple implementations.
    // 4. Abstraction : Abstraction is the concept of object-oriented programming that "shows" only essential attributes and "hides" unnecessary information.
    // OOP is a popular programming paradigm because it allows the programmer to create modular programs and reusable code.
    // OOP makes it easy to maintain and modify existing code as new objects can be created with small differences to existing ones.
    // OOP provides a clear structure for the programs, which makes it easy to map real-world problems and their solutions.
    // OOP makes it easy to maintain and modify existing code as new objects can be created with small differences to existing ones.


    // lesson 4 : Classes and Objects
    // A class is a blueprint for objects. We can think of a class as a sketch (prototype) of a house. It contains all the details about the floors, doors, windows, etc. Based on these descriptions we build the house. House is the object.
    // An object is an instance of a class. When a class is defined, no memory is allocated but when it is instantiated (i.e. an object is created) memory is allocated.

//    class className{
//        field  - states - attributes : store data
//        Methods - functionalities - behaviour : perform operations
//    }

}
