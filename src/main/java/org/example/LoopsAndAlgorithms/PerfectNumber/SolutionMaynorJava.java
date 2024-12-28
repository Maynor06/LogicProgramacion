package org.example.LoopsAndAlgorithms.PerfectNumber;

import java.util.Scanner;

public class SolutionMaynorJava {

    public static Boolean isPerfectNumber(int num) {

        int sum = 0;

        if (num < 0){
            return false;
        }

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(isPerfectNumber(num)){
            System.out.println(num + " is a Perfect number");
        }else {
            System.out.println(num + " is not a Perfect number");
        }
    }
}
