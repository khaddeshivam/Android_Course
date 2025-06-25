package anotherpackage;

import java.util.*;
import java.util.Scanner;

// Exercise 6: Write a program to multiply corresponding elements of two arrays of integers.

public class Exercise_6 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of the arrays: ");
//        int n = sc.nextInt();
//        int[] arr1 = new int[n];
//        int[] arr2 = new int[n];
//        System.out.println("Enter the elements of the first array: ");
//        for (int i = 0; i < n; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("Enter the elements of the second array: ");
//        for (int i = 0; i < n; i++) {
//            arr2[i] = sc.nextInt();
//        }
//        System.out.println("The product of the corresponding elements of the two arrays is: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr1[i] * arr2[i] + " ");
//        }
//        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int n =sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter the elements of the first array: ");
        for(int i =0; i<n; i++){
            arr1 [i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array: ");
        for(int i =0; i<n; i++){
            arr2 [i] = sc.nextInt();
        }
        System.out.println("The product of the corresponding elements of the two arrays is: ");
        System.out.println(java.util.Arrays.toString(arr1));
//        for(int i=0; i<n; i++){
//            System.out.print(" "+"x"+" ");
//        }
//        System.out.println();
        System.out.println(java.util.Arrays.toString(arr2));
        System.out.println("------------------");
        for(int i=0; i<n; i++){
            System.out.print(arr1[i] * arr2[i] + " ");
        }
    }
}
