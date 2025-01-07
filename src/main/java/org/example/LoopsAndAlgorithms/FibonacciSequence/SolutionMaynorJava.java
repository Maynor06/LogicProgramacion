package org.example.LoopsAndAlgorithms.FibonacciSequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionMaynorJava {

    public static List<Integer> sequenceFibonacci(int num){

        int startNumber = 0;
        int nextNumber = 1;
        List<Integer> list = new ArrayList<Integer>();
        list.add(startNumber);
        list.add(nextNumber);

        for (int i = 0; i < num -2; i++) {

            int sequence = startNumber + nextNumber;
            startNumber = nextNumber;
            nextNumber = sequence;
            list.add(sequence);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number  : ");
        int num = scanner.nextInt();
        if (num > 0){
            List<Integer> list = sequenceFibonacci(num);
            System.out.print("Sequence: ");
            list.forEach(sequence -> System.out.print(sequence + ", "));
        }else {
            System.out.println("Invalid number for sequence");
        }


    }
}
