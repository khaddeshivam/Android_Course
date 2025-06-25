package com.demo_2.lib;

public class rectangle {
    private double length;
    private double breadth;

    public rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }
    public double Area(){
        System.out.print("The area of the rectangle is: ");
        return length * breadth;
    }
    public double perimeter(){
        System.out.print("The perimeter of the rectangle is: ");
        return 2 * (length + breadth);
    }
}
