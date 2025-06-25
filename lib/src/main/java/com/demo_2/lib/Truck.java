package com.demo_2.lib;

// 50: Polymorphism
//public class Truck extends Vehicle{
//    public Truck(int numberofWheels){
//        super(numberofWheels);
//    }
//
//    @Override
//    void start(){
//        System.out.println("The Truck starts");
//    }
//
//    @Override
//    void brake() {
//        System.out.println("Applying Hydraulic Brake...");
//    }
//
//    @Override
//    void honk() {
//        System.out.println("Beep! Beep!");
//    }
//}

// 52: Interface
public class Truck extends Vehicle implements vehicle_Interface{
    String truckModel;

    public Truck(String modelOfTruck) {
        super(14);
        truckModel = modelOfTruck;
    }

    void honk(){
        System.out.println("Boop! Boop!");
    }

    @Override
    public void startEngine() {
        System.out.println("The Truck starts");
    }

    @Override
    public void stopEngine() {
        System.out.println("The Truck stops");
    }

    @Override
    public void accelerate() {
        System.out.println("The Truck accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Applying Hydraulic brakes...");
    }
}
