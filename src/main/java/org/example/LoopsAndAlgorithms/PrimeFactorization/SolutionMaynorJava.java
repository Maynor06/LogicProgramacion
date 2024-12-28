package org.example.LoopsAndAlgorithms.PrimeFactorization;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionMaynorJava {

    public static List<Integer> primeFactors(int num) {

        List<Integer> primes = new ArrayList<Integer>();
        int numberOriginal = num;
        int count = 2;

        if(num < 0 || num == 0){
            System.out.println("Please enter a positive number");
            System.exit(0);
        } else if (num == 1) {
            System.out.println("please enter a prime number");
            System.exit(0);
        }

        while(numberOriginal != 1) {
            if(numberOriginal % count == 0) {
                primes.add(count);
                numberOriginal = numberOriginal / count;

            }else {
                count++;
            }
        }

        return primes;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of primes");
        int num = scanner.nextInt();

        List<Integer> primeFactors = primeFactors(num);
        System.out.print("Prime factors of " + num + " are: ");
        primeFactors.forEach(factor -> System.out.print(factor + ", "));

    }
}
