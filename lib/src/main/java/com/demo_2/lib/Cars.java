package com.demo_2.lib;

public class Cars {
//    // Fields
//    public String model; // public
//    public int speed; // private
//    public int year; // protected

    // Methods
    public void accelerate(){
        speed += 10;
        System.out.println("The new speed of the car is(accelerating): " + speed);
    }
    void brake(){
        speed -= 5;
        System.out.println("The new speed of the car is(breaking)): " + speed);
    }

    // Constructor : is a special method that is called when an object is created.

    public Cars(String carModel, int carSpeed, int carYear){
        model = carModel;
        speed = carSpeed;
        year = carYear;
        System.out.println("Constructor called");
    }

//        // **Default Constructor** (Allows object creation without parameters)
//        public Cars() {
//            this.model = "Unknown";
//            this.speed = 0;
//            this.year = 2000;  // Default values
//        }
//
//        // **Parameterized Constructor**
//        public Cars(String carModel, int carSpeed, int carYear) {
//            this.model = carModel;
//            this.speed = carSpeed;
//            this.year = carYear;
//        }

    // 46. Encapsulation
    // Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
    // states
    public String model;
    private int year;
    private int speed;

    // Getters &  Setters
    // if I am deciding to create getter for year then
    public int getYear(){
        return year;
    }

    public void setYear(int newYear){
        year = newYear;
    }

    // Alt + insert shortcut key for getter and setter

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}

