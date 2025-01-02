package org.example.LoopsAndAlgorithms.ArmstrongNumberChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionMaynorJava {

    public static Boolean areArmstrong(int num){

        int sum = 0;
        List<Integer> listDigits = new ArrayList<Integer>();
        int numOriginal = num;

        while(numOriginal != 0){
            int digit = numOriginal % 10;
            listDigits.add(digit);
            numOriginal /= 10;
        }
        int power = listDigits.size();

        for (int i = 0; i < power; i++) {
            sum += (int) Math.pow(listDigits.get(i), power);
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if(areArmstrong(num)){
            System.out.println("is an Armstrong number");
        }else {
            System.out.println("is Not an Armstrong number");
        }

    }

}
