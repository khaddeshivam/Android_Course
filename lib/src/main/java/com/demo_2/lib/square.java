package com.demo_2.lib;

public class square {
     private double side;

    public square(double side) {
        this.side = side;
    }

    public double Area(){
        System.out.print("The area of the square is: ");
        return side * side;
    }
    public double perimeter(){
        System.out.print("The perimeter of the square is: ");
        return 4 * side;
    }
}
