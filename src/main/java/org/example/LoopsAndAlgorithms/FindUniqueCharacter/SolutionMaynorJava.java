package org.example.LoopsAndAlgorithms.FindUniqueCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionMaynorJava {

    public static Character findUniqueCharacter(String input) {

        Character charUnique = null;

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (map.containsKey(c)) {

                map.put(c, map.get(c) + 1);

            }else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet() ) {
            if (entry.getValue() == 1) {
                charUnique = entry.getKey();
            }
        }

        return charUnique;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        Character charUnique = findUniqueCharacter(input);
        if (charUnique != null) {
            System.out.println( "'" + charUnique + "' is the first non-repeating character ");
        }else {
            System.out.println("No unique characters found.");
        }
    }
}
