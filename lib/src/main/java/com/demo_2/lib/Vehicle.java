package com.demo_2.lib;

//// 47: Inheritance
//// Parent class
//public class Vehicle {
//    int numberofWheels;
//
//    public Vehicle(int numberofWheels){
//        this.numberofWheels = numberofWheels;
//    }
//    void start(){ System.out.println("The Vehicle Starts");}
//    void stop(){System.out.println("The Vehicle Stops");}
//
//
//}

// 51: Abstraction
// We use the abstract keyword to make a class abstract.
public abstract class Vehicle { // Abstract Class
    int numberOfWheels;

    public Vehicle(int numberofWheels){
        this.numberOfWheels = numberofWheels;
    }
    void start(){ System.out.println("The Vehicle Starts");}
    void stop(){System.out.println("The Vehicle Stops");}

    // Abstract Method
    abstract void brake();
    abstract void honk();
}