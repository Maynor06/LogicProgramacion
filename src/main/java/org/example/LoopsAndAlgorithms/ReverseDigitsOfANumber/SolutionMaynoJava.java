package org.example.LoopsAndAlgorithms.ReverseDigitsOfANumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionMaynoJava {

    public static Integer reverseDigits(int num) {

        String digits = "";
        int testNumber = num;

        while (testNumber > 0) {
             digits += String.valueOf(testNumber % 10);
             testNumber /= 10;
        }
        return  Integer.parseInt(digits);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter an number integer: ");
        int number = scanner.nextInt();
        System.out.println("the number in reversed is: " + reverseDigits(number));
    }

}
