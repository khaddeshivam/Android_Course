package com.demo_2.lib;

// 51: Abstraction
// Child Class
//public class car_Interface extends Vehicle{
//    String carModel;
//
//    public car_Interface(String modelOfCar) {
//        super(4);
//        carModel = modelOfCar;
//    }
//
//    @Override
//    void brake() {
//        System.out.println("No brakes...");
//    }
//
//    void honk(){
//        System.out.println("Boop! Boop!");
//    }
//}

// 52: Interface
public class car_Interface extends Vehicle implements vehicle_Interface{
    String carModel;

    public car_Interface(String modelOfCar) {
        super(4);
        carModel = modelOfCar;
    }

    void honk(){
        System.out.println("Boop! Boop!");
    }

    @Override
    public void startEngine() {
        System.out.println("The car starts");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car stops");
    }

    @Override
    public void accelerate() {
        System.out.println("The car accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Applying Mechanical brakes...");
    }
}