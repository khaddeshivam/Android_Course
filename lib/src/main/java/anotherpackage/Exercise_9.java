package anotherpackage;

import java.util.Scanner;

// Exercise 9: Write a program to add two matrices of the same size.

public class Exercise_9 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of the two matrices: ");
//        int n = sc.nextInt();
//
//        System.out.println("Enter the elements of the first matrix: ");
//        int[][] matrix1 = new int[n][n];
//        for (int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                matrix1[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter the elements of the second matrix: ");
//        int[][] matrix2 = new int[n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                matrix2[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("The first matrix is: ");
//        printMatrix(matrix1, n);
//        System.out.println("The second matrix is: ");
//        printMatrix(matrix2, n);
//
//        System.out.println("The sum of the two matrices is: ");
//        int[][] sum = addMatrices(matrix1, matrix2, n);
//        printMatrix(sum, n);
//    }
//
//    public  static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int n){
//        int[][] sum = new int[n][n];
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                sum[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//        }
//        return sum;
//    }
//    public static void printMatrix(int[][] matrix, int n){
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
////        System.out.println(Arrays.deepToString(matrix));
//    }

    // Alternate Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
