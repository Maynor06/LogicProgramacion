package org.example.LoopsAndAlgorithms.PalindromeChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionMaynorJava {

    public static Boolean isPalindrome(String input) {

        String input2 = input.toLowerCase();
        input2 = input2.replaceAll("[\\W]", "");

        if(input2.isEmpty()){
            System.out.println("Empty String or Null");
            System.out.println("please enter a string valid");
            return false;
        }

        String reversed = new StringBuilder(input2).reverse().toString();

        return input2.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean keepGoing = true;

        do {
            System.out.println("Please enter a string to check palindrome");
            String input = scanner.nextLine();

            if(isPalindrome(input)) {
                System.out.println("the phrase is a palindrome");
            }else {
                System.out.println("the phrase is not a palindrome");
            }

            System.out.println("want to keep? (y/n)");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("y")) {
                keepGoing = true;
            }else {
                keepGoing = false;
            }
        }while(keepGoing);

    }
}
