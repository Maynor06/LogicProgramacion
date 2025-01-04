package org.example.LoopsAndAlgorithms.LeastCommonMultiple;

import java.util.Scanner;

public class SolutionMaynorJava {

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if(a > 0 && b > 0){
            int lcm = lcm(a, b);
            System.out.println("The Least Common Multiple is: " + lcm);
        }else {
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}
