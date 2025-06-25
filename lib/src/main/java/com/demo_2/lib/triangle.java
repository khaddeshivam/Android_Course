package com.demo_2.lib;

public class triangle {
    private double base;
    private double height;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double Area(){
        System.out.print("The area of the triangle is: ");
        return 0.5 * base * height;
    }
    public double perimeter(){
        System.out.print("The perimeter of the triangle is: ");
        return 3 * base;
    }
}
