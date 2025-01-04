package org.example.LoopsAndAlgorithms.GreatestCommonDivisor;

import java.util.Scanner;

public class SolutionMaynorJava {

    public static int gcd(int a, int b) {

        if(b == 0) return a;
        return gcd(b, a % b);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        if(a <= 0 || b <= 0){
            System.out.println("no accept numbers negatives");
            System.exit(0);
        }

        System.out.println("the Greatest Common Divisor is: " + gcd(a, b));
    }
}
