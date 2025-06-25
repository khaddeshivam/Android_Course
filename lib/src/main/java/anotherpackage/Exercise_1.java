package anotherpackage;
import java.util.Scanner;

// Exercise 1: Write a program to find the division and remainder of two numbers.

public class Exercise_1 {
    static class division{
        private float div(int a , int b){
            return (float) a /b;
        }
        private void display(float div){
            System.out.println("Division of " + "n1/n2 : " + div);
        }
    }
    static class remainder{
        private float rem(int a , int b){
            return (float) a % b;
        }
        private void display(float rem){
            System.out.println("Remainder of " + "n1%n2 : " + rem);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number:");
        int n1 = sc.nextInt();
        System.out.print("Enter the Second number:");
        int n2 = sc.nextInt();

        division obj = new division();
        obj.div(n1, n2);
        obj.display( obj.div(n1, n2) );

        remainder obj1 = new remainder();
        obj1.rem(n1, n2);
        obj1.display( obj1.rem(n1, n2) );

        sc.close();

    }
}
