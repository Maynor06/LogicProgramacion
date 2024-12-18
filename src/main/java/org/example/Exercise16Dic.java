package org.example;

//Ejercicio 1: Palíndromos
//        Escribe una función que determine si una palabra o frase es un palíndromo. Un palíndromo es una palabra o frase que se lee igual de izquierda a derecha que de derecha a izquierda, ignorando espacios, mayúsculas y signos de puntuación.
//
//        Instrucciones
//        La función debe recibir una cadena como parámetro.
//        El programa debe eliminar los espacios y convertir la cadena a minúsculas para realizar la comparación.
//        Debe devolver true si es un palíndromo y false si no lo es.

import java.util.Scanner;

public class Exercise16Dic {

    public static void palindromo(String phrase ){
        String phrase1 = phrase.replace(" ", "").toLowerCase();

        char[] charFrase = phrase1.toCharArray();
        char[] charFraseReverse = new char[charFrase.length];

        String frase = new String(charFrase);
        String fraseReverse = "";


        for (int i = 0; i < frase.length(); i++) {
            charFraseReverse[i] = charFrase[ charFrase.length-i-1];
        }

        fraseReverse = new String(charFraseReverse);

        if(frase.equals(fraseReverse) ){
            System.out.println("la frase: " + phrase);
            System.out.println(" ");
            System.out.println(" es palindromo");
        }else {
            System.out.println("la frase: " + phrase);
            System.out.println(" ");
            System.out.println(" no es palindromo");
        }
    }

    public static Scanner newScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("dijite una frase");
        String phrase = newScanner.nextLine();
        palindromo(phrase);

    }


}
