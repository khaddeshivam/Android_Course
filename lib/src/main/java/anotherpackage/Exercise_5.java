package anotherpackage;
import java.util.*;
import java.util.Scanner;


// Exercise 5: Write a program to reverse a string.
public class Exercise_5  {
//    public static String reverseString(String str){
//        char[] ch = str.toCharArray();
//        // let us first store the string in array
//        int i = 0, j = str.length() - 1;
//        while (i < j) {
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;
//            j--;
//        }
//        // now return the array by backwards and store it in a string
//        return new String(ch);
//    }

    public static void main(String[] args) {
        // my Method
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//        System.out.println("The Original Entered String is: " + str);
//
//        System.out.println("The Reversed String is: " + reverseString(str));
//        sc.close();

        // lecture method
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String to reverse: ");
        char[] letters = sc.nextLine().toCharArray();
        System.out.println("The Reversed String is:");
        for (int i = letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }
        System.out.println();
    }
}
