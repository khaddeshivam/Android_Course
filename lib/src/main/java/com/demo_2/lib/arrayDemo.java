package com.demo_2.lib;

public class arrayDemo {
    public static void main(String[] args){
        System.out.println( 5.45 + "3,2");

        char[] array_variable = new char[10];

        for (int i = 0; i < 10; ++i)

        {

            array_variable[i] = 'i';

            System.out.print(array_variable[i] + " ");

        }

        System.out.println();
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        double a, b,c;

        a = 3.0/0;

        b = 0/4.0;

        c=0/0.0;



        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

        char chars[] = {'a', 'b', 'c'};

        String s = new String(chars);

        System.out.println(s);

        // Array Exercise

        // 1. One-dimensional Array : is an array in Java
        // Syntax:
        //  dataType[] arrayName = new dataType[size];
        int[] marks = new int[5];

        // Storing values in array
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        // Accessing the array elements
        System.out.print("Marks Array elements: ");
        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();

//        for-each:
//        for (dataType variableName : arrayName)
//        How it works:
//        The loop directly iterates over each element in marks.
//                Instead of using an index, each element is assigned to mark.
//                No need to worry about loop conditions (i < marks.length).
        for (int markArray : marks) {
            System.out.print(markArray + " ");
        }
        System.out.println();

        // 2. Multi-dimensional Array : is an 2D array in Java
        // Syntax:
        //  dataType[][] arrayName = new dataType[row][column];

        // Exercise
        // 3 x 3 matrix
        int[][] matrix = new int[3][3];

        // Storing values in 3 x 3 matrix
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // Accessing the 3 x 3 matrix elements.
        System.out.println("Matrix Array elements: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Size of matrix row: " + matrix.length + " column: " + matrix[0].length);

        // *. 3 rows and 3 columns
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matrix1 Array elements: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Size of matrix1 row: " + matrix1.length + " column: " + matrix1[0].length);

        // Accessing row 2 and col 0 element
        System.out.println("Row 2 and Col 2 element: " + matrix1[1][2]);


    }
}