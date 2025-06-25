package com.demo_2.lib;

// 47: Inheritance
// Child Class
public class carChild extends Vehicle {
    String carModel;

    public carChild(String modelOfCar) {
        super(4);
        carModel = modelOfCar;
    }

    void honk(){
        System.out.println("Beep! Beep!");
    }

    // 49: Method Overriding
//     Overriding the start method from the parent class
//     We can only override the methods that are inherited from the parent class like start()
//    There are some Rules for Method Overriding:
   // 1. The method must have the same name as the method in the parent class.
   // 2. The method must have the same parameter list as the method in the parent class. eg. stop() in Vehicle class and not Stop()
   // 3. The return type of the method must be the same or a subtype of the return type of the method in the parent class.
   // 4. The method must be declared in the same class as the parent class.
   // 5. The method must be declared with the same access modifier as the method in the parent class.

    // We cannot Override the constructor, final, static methods, private methods, and abstract methods.
    // we should use override abstract methods of the super class or parent class
    // so always override the abstract method of the parent class.
    @Override
    void start(){
        System.out.println("The car starts");
    }

    @Override
    void brake() {
        System.out.println("Applying Mechanical brakes...");
    }


}
