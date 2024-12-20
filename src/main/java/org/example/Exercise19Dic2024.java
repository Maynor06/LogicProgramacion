/*
    Exercise for Today
    Exercise 4: Perfect Numbers

    A number is called a perfect number if it is equal to the sum of its proper divisors (excluding itself).
    For example, 6 is a perfect number because its divisors are 1, 2, and 3, and their sum is 6.

Instructions:

    1. Write a program to check if a number entered by the user is a perfect number.
    2. Create a method to calculate the sum of the proper divisors of a number.
    3. The program should output whether the number is perfect or not.
*/

package org.example;

import java.util.Scanner;

public class Exercise19Dic2024 {

    public static Boolean perfectNumber(int num){

        int sum = 0;

        for (int i= 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        return sum == num;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        System.out.println("------------------------> is perfect number? <-------------------------");
        if (perfectNumber(num)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}
