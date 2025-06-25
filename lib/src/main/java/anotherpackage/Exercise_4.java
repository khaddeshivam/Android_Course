package anotherpackage;
import java.util.*;
import java.util.Scanner;

// Exercise 4: Write a program to count the letters, spaces, numbers and other characters of an input string.

public class Exercise_4 {
    public static void count(String str){
        char[] ch = str.toCharArray();
        int letters = 0, spaces = 0, numbers = 0, others =0;

        for(int i =0; i < str.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letters++;
            }
            else if (Character.isDigit(ch[i])) {
                numbers++;
            }
            else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            }
            else {
                others++;
            }
        }
        System.out.println("Number of letters: " + letters);
        System.out.println("Number of spaces: " + spaces);
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Number of other characters: " + others);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        count(str);

//        int letters = 0, spaces = 0, numbers = 0, others = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if(Character.isLetter(ch)){
//                letters++;
//            } else if(Character.isDigit(ch)){
//                numbers++;
//            } else if(Character.isSpaceChar(ch)){
//                spaces++;
//            } else {
//                others++;
//            }
//        }
//        System.out.println("Number of letters: " + letters);
//        System.out.println("Number of spaces: " + spaces);
//        System.out.println("Number of numbers: " + numbers);
//        System.out.println("Number of other characters: " + others);
//        sc.close();

    }
}
