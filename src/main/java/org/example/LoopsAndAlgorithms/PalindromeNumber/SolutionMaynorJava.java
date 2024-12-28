package org.example.LoopsAndAlgorithms.PalindromeNumber;

import java.util.Scanner;

public class SolutionMaynorJava {

    public static Boolean isPalindrome(int number) {

        int reversedNumber = 0;
        int originalNumber = number;

        if(number > 0){
            while(originalNumber != 0) {
                reversedNumber = reversedNumber * 10 + originalNumber % 10;
                originalNumber /= 10;
            }
        }else {
            return false;
        }

        return number == reversedNumber;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to evaluate: ");
        int number = scanner.nextInt();

        if(isPalindrome(number)) {
            System.out.println("the number is palindrome");
        }else {
            System.out.println("the number is not palindrome");
        }

    }
}
