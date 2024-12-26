package org.example.LoopsAndAlgorithms.ReverseDigitsOfANumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionMaynoJava {

    public static Integer reverseDigits(int num) {

        int reversed = 0;
        int originalNum = num;

        while (originalNum > 0) {
            reversed = reversed * 10 + originalNum % 10;
            originalNum /= 10;

        }
        return  reversed;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter an number integer: ");
        int number = scanner.nextInt();
        System.out.println("the number in reversed is: " + reverseDigits(number));
    }

}
