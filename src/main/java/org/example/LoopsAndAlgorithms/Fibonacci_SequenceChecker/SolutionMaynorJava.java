package org.example.LoopsAndAlgorithms.Fibonacci_SequenceChecker;

import java.util.Scanner;

public class SolutionMaynorJava {

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
