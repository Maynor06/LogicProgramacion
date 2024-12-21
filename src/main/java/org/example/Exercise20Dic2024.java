/*
Exercise for Today
Exercise 5: Abundant and Deficient Numbers

A number is called:

Abundant if the sum of its proper divisors is greater than the number.
Deficient if the sum of its proper divisors is less than the number.

    Instructions:

    1. Write a program to determine if a number entered by the user is abundant or deficient.
    2. Use a method to calculate the sum of the proper divisors.
    3. The program should output whether the number is abundant, deficient, or perfect.
*/

package org.example;

import java.util.Scanner;

public class Exercise20Dic2024 {

    public static Boolean isDeficientNumber (int number) {

        int sum = 0;

        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }

        return sum < number;
    }

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
        int number = scanner.nextInt();

        if(perfectNumber(number)) {
            System.out.println("The number is perfect");
        }else {
            if(isDeficientNumber(number)) {
                System.out.println("The number is deficient");
            }else {
                System.out.println("The number is Abundant");
            }
        }

    }

}
