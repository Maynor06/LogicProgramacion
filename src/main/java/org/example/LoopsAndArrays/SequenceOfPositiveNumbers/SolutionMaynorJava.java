package org.example.LoopsAndArrays.SequenceOfPositiveNumbers;

import java.util.Scanner;

public class SolutionMaynorJava {

    public static int sequenceNumberPositive(int[] num){
        int sum = 0;

        for (int j : num) {
            if (j > 0) {
                sum++;
            } else {
                sum = 0;
            }
        }

        return sum;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static int[] enterNumbers(){
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static void main(String[] args) {

        int[] numbersEvaluate = enterNumbers();

        int sizeSequence = sequenceNumberPositive(numbersEvaluate);

        System.out.println("the Longest Sequence of Positive Numbers in an Array is that:" + sizeSequence);

    }

}
