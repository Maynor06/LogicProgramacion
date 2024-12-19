package org.example;

/*
Ejercicio 3: Números Primos Gemelos

Dos números primos se llaman primos gemelos si la diferencia entre ellos es exactamente 2.

Instrucciones
    1. Escribe un programa que determine si dos números ingresados por el usuario son primos gemelos.
    2. Define un método que determine si un número es primo.
    3. Devuelve si los números son primos gemelos o no.

*/

import java.util.Scanner;

public class Exercise18Dic2024 {

    public static boolean areCousin (int num){

        int sum = 0;

        for (int i = 1; i <= num; i++ ) {
            if(num % i == 0){
                sum ++;
            }
        }

        return sum == 2;
    }

    public static void twinCousin (int num, int num2){
        if(areCousin(num) && areCousin(num2)){
            if(num2 - num == 2){
                System.out.println("los numeros son primos gemelos");
            }else{
                System.out.println("los numeros no son primos gemelos");
            }
        }else {
            System.out.println("los numeros no son primos, porfavor introduzca numeros primos :D");
        }
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter nums: ");
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        twinCousin(num, num2);

    }
}
