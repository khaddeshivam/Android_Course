package anotherpackage;
import java.util.*;
import java.util.Scanner;

// Exercise 3: Write a program to convert a decimal number to binary number.

public class Exercise_3 {
    // Method to convert decimal to binary
//    public static String decimalToBinary(int decimal){
//        String binary = "";
//
//        // Using StringBuilder:
//        // StringBuilder binary = new StringBuilder();
//        // while(decimal > 0){
//        //     binary.append(decimal % 2);
//        //     decimal = decimal / 2;
//        // }
//        // return binary.reverse().toString();
//        // Using recursion:
//        // if(decimal == 0) return "0";
//        // return decimalToBinary(decimal / 2) + decimal % 2;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dec = 0, quot, i = 1, j;
        int[] bin =  new int[100];

        System.out.print("Enter a Decimal Number : ");
        dec = sc.nextInt();
        quot = dec;
        while (quot != 0){
            bin[i++] = quot % 2;
            quot = quot/2;
        }
        System.out.println("Binary number is: ");
        for( j = i-1; j>0; j--){
            System.out.print(bin[j]);
        }
        System.out.println();
    }
}
