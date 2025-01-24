package org.example.LoopsAndArrays.TransponseMatrix;

import java.util.Scanner;

public class SolutionMaynorJava {

    private static void transponseMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("columns");
        int columns = sc.nextInt();
        System.out.println("rows");
        int rows = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("enter values");

        if(columns > 0 && rows > 0){

            for (int i= 0; i < rows; i++) {
                for (int j= 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

        }else {
            System.out.println("please enter a number between 1 and 100");
            System.exit(0);
        }

        int[][] matrixtranspose = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrixtranspose[i][j] = matrix[j][i];
            }
        }

        System.out.println("The matrix is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("The matrix transposed is:");

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrixtranspose[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        transponseMatrix();

    }
}
