/*
Next Problem
Category: Loops and Algorithms
Difficulty: Moderate

Exercise 6: Fibonacci Sequence Checker

Write a program to check if a number entered by the user is part of the Fibonacci sequence.
    Instructions:

    1. Create a method to generate Fibonacci numbers up to a given limit.
    2. Check if the user input matches any of the Fibonacci numbers.
    3. Output whether the number belongs to the Fibonacci sequence or not.
    4. This will help strengthen your understanding of loops and mathematical sequences!

*/

package org.example.LoopsAndAlgorithms;

import java.util.Scanner;

public class Exercise23Dic2024 {

    public static Boolean isPart(int num){

        int startNumber = 0;
        int nextNumber = 1;
        Boolean isPart = false;

        for (int i = 0; i <= num; i++) {

            int sequence = startNumber + nextNumber;
            startNumber = nextNumber;
            nextNumber = sequence;
            if(nextNumber == num){
                isPart = true;
            }
        }

        return isPart;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter the number that believe is part of the sequence fibonacci");
        int num = scanner.nextInt();

        if (isPart(num)){
            System.out.println("the number is part");
        }else {
            System.out.println("the number is not part");
        }


    }

}
