package com.demo_2.lib;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area(){
        System.out.print("The area of the circle is: ");
        return 3.14 * radius * radius;
    }

    public double perimeter(){
        System.out.print("The perimeter of the circle is: ");
        return 2 * 3.14 * radius;
    }

}
