package org.example.LoopsAndAlgorithms.FactorialRecursing;

import java.util.Scanner;

public class SolutionMaynorJava {

    public static int factorial(int n) {

        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number that calculates the factorial of the given number: ");
        int n = in.nextInt();

        if(n > 0){
            System.out.println("The factorial of "+ n + " is: " + factorial(n));
        }else {
            System.out.println("Invalid input, please enter a positive number");
        }
    }

}
