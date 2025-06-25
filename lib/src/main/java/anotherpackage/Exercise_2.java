package anotherpackage;
import java.util.*;
import java.util.Scanner;

// Exercise 2: Write a program to find the area and perimeter of a circle.

public class Exercise_2 {
    public static float calculateArea(float radius){
        return (float) (Math.PI * radius * radius);
    }
    public static float calculatePerimeter(float radius){
        return (float) (2 * Math.PI * radius);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("The area of the circle is: " + calculateArea(radius));

        System.out.println("The perimeter of the circle is: "+ calculatePerimeter(radius));
    }
}
