package org.example.LoopsAndAlgorithms.LongestWordinSentence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionMaynorJava {

    public static List<String> longestWord(String sentence) {

        if (sentence == null || sentence.replaceAll("[^a-zA-Z ]", "") == "") {
            System.out.println("Please enter a valid sentence.");
            System.exit(0);
        }

        String longestWord = "";
        String isequal= "";
        List<String> wordsList = new ArrayList<>();

        sentence = sentence.replaceAll("[^a-zA-Z ]", "");

        for (String word : sentence.split(" ")) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }else if (word.length() == longestWord.length()) {
                isequal = word;
            }
        }
        wordsList.add(longestWord);
        wordsList.add(isequal);

        return wordsList;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        List<String> words = longestWord(sentence);
        System.out.print("Longest word(s): "); words.forEach(word -> System.out.print(word + ", "));
    }

}
