package com.demo_2.lib;

public class arr {
    public static void main(String[] args) {
//        Finding Max Value of an Array
//        Write a Java Function named as :
//        "findMaxValue" that takes into parameters an integer array, and returns the maximum value of the integers in this array.
//        For Example:
//        we have this array of integers:
//        int[] arr = {5, 8, 3, 12, 7};
//        the function will take this array as a parameter when called, then it returns the integer "12" as the greatest element in this array.
//
        System.out.println("Hello World !");
        System.out.println("The maximum value is: "+ findMaxValue(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
    static int findMaxValue(int[] arr) {
        // find the max from the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
