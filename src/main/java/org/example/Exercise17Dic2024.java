//Ejercicio del día de hoy
//Ejercicio 2: Números Amigables

//Dos números se llaman amigables si la suma de los divisores propios (excluyendo el número) del primer número es igual al segundo número, y la suma de los divisores propios del segundo número es igual al primero.

//Instrucciones

// 1. Escribe un programa que determine si dos números ingresados por el usuario son amigables.
// 2. Define un método que calcule la suma de los divisores propios de un número.
// 3. El programa debe devolver si los números son amigables o no.


package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise17Dic2024 {

    public static boolean divisores(int num1, int num2){
        int suma1 = 0;
        int suma2 = 0;

        for(int i=1; i < num1; i++){
            if(num1 % i == 0 ){
                suma1 += i;
            }
        }

        for(int i=1; i < num2; i++){
            if(num2 % i == 0 ){
                suma2 += i;
            }
        }

        return suma1 == num2 && suma2 == num1;

    }

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingresa los numeros que crees son amigables ");
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        boolean amigables = divisores(num, num2);

        System.out.println(" ");
        System.out.println("Los numeros " + num + " y " + num2);
        if(amigables){
            System.out.println("SON AMIGABLES");
        }else {
            System.out.println("NO SON AMIGABLES");
        }
    }

}
