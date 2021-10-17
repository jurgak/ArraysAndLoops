package com.company;

import java.util.Locale;
import java.util.Arrays;

public class String1 {

    public static void main(String[] args) {
        String[] words = new String[9];
        fillArray(words);
        startsWithCh(words);
        endsWithCh(words);
        lengthCheck(words);
        containsLetter(words);
        containsSubString(words);
        histogram(words);
    }

    static void fillArray(String[] words) {
        words[0] = "Computer";
        words[1] = "Plate";
        words[2] = "Chair";
        words[3] = "Girl";
        words[4] = "Boy";
        words[5] = "Cat";
        words[6] = "Dog";
        words[7] = "Shirt";
        words[8] = "Determination";
    }

    static void startsWithCh(String[] words) {
        char checkFor = 'C';
        int counter = 0;
        for (String word : words) {
            if (word.toUpperCase(Locale.ROOT).charAt(0) == checkFor) {
                counter++;
            }
        }
        String startsWithCh = String.format("There are " + counter + " words that start with %c", checkFor);
        System.out.println(startsWithCh);
    }

    static void endsWithCh(String[] words) {
        String checkFor = "e";
        int counter = 0;
        for (String word : words) {
            if (word.endsWith(checkFor)) {
                counter++;
            }
        }
        String endsWithCh = String.format("There are " + counter + " words that end with with %s", checkFor);
        System.out.println(endsWithCh);
    }

    static void lengthCheck(String[] words) {
        int length = 5;
        int counter = 0;
        for (String word : words) {
            if (word.length() == length) {
                counter++;
            }
        }
        String wordLength = String.format("There are " + counter + " words with the length of %d letters", length);
        System.out.println(wordLength);
    }

    static void containsLetter(String[] words) {
        String letter = "e";
        int counter = 0;
        for (String word : words) {
            if (word.contains(letter)) {
                counter++;
            }
        }
        String containsLetter = String.format("There are " + counter + " words that contain letter %s", letter);
        System.out.println(containsLetter);
    }

    static void containsSubString(String[] words) {
        String substring = "te";
        String containsString = String.format("Does any of the words contain string %s?", substring);
        System.out.print(containsString + " ");
        int counter = 0;
        for (String word : words) {
            if (word.contains(substring)) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("Yes. There are " + counter + " such words.");
        } else System.out.println("No");
    }

    static void histogram(String[] words) {
        int[] wordLetterCount = new int[words.length];
        Arrays.setAll(wordLetterCount, i -> words[i].length());
        Arrays.sort(wordLetterCount);
        int min = wordLetterCount[0];
        int max = wordLetterCount[wordLetterCount.length - 1];
        int letterCount = min;
        while (letterCount <= max) {
            int wordCount = 0;
            for (int count : wordLetterCount) {
                if (count == letterCount) {
                    wordCount ++;
                }
            }
            System.out.println("There are " + wordCount + " words with " + letterCount + " letters");
            letterCount++;
        }
    }

}
