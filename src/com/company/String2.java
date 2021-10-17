package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class String2 {

    public static void main(String[] args) {
        String sentence = "Climb mountains not so the world can see you, but so you can see the world.";
        System.out.println(sentence);
        countWordsTotal(sentence);
        countWord(sentence);
        wordWithLetter(sentence);
        duplicateWords(sentence);
        String newSentence = sentence.replace("you", "You");
        System.out.println(newSentence);
    }

    static void countWordsTotal(String sentence) {
        String[] words = sentence.split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: " + wordCount);
    }

    static void countWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String findWord = "the";
        int counter = 0;
        for (String word : words) {
            if (Objects.equals(word, findWord)) {
                counter++;
            }
        }
        String countWord = String.format("Number of '%s' words in the sentence: ", findWord);
        System.out.println(countWord + counter);
    }

    static void wordWithLetter(String sentence) {
        String[] words = sentence.split("\\s+");
        String letter = "s";
        String letterC = "S";
        int counter = 0;
        for (String word : words) {
            if (word.contains(letter) || word.contains(letterC)) {
                counter++;
            }
        }
        String containsLetter = String.format("There are " + counter + " words that contain letter %s", letter);
        System.out.println(containsLetter);
    }

    static void duplicateWords(String sentence) {
        String[] words = sentence.split("\\s+");
        Set<String> set = new HashSet<>();
        int counter = 0;
        System.out.print("Words that are in the sentence multiple times: ");
        for (String word : words) {
            if (!set.add(word)) {
                System.out.print(word + ", ");
            }
        }
        System.out.print("\n");
    }

}
