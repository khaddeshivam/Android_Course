package anotherpackage;

import java.util.*;
import java.util.Scanner;

// Exercise 10: Write a program to calculate the average value of array elements.

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Original array is: "+ Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        double average = (double) sum / n;
        System.out.println("The average value of the array elements is: " + average);
    }
}
