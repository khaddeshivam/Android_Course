package anotherpackage;

import java.util.Scanner;

// Exercise 7: Write a program to count the number of even and odd elements in an given array of integers.

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Input the array elements: ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int even_count =0, odd_count =0;
        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("Number of even elements in the array: " + even_count);
        System.out.println("Number of odd elements in the array: " + odd_count);
        sc.close();
    }
}
