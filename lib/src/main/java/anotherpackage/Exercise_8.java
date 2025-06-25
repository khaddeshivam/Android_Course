package anotherpackage;

import java.util.Scanner;

// Exercise 8: Write a program to make a such a pattern like a pyramid with a number which will repeat the number in the same row.
//Eg. NUMBER OF ROWS: 4
//        1
//       2 2
//      3 3 3
//     4 4 4 4

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
