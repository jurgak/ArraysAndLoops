package com.company;

import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 - loop FOR");
        System.out.println("Press 2 - loop FOR EACH");
        System.out.println("Press 3 - loop WHILE");
        System.out.println("Press 4 - loop DO WHILE");
        int choice = input.nextInt();
        switching(choice);
    }

    static void switching(int choice) {
        int[] newArray = {5, 3, 7, 6, 2, 8};
        switch (choice) {
            case 1 -> loopFor(newArray);
            case 2 -> loopEach(newArray);
            case 3 -> loopWhile(newArray);
            case 4 -> loopDoWhile(newArray);
        }
    }


    static void loopFor(int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);

        }
    }

    static void loopEach(int[] newArray) {
        for (int value : newArray) {
            System.out.println(value);

        }
    }

    static void loopWhile(int[] newArray) {
        int i = 0;
        while (i < newArray.length) {
            System.out.println(newArray[i]);
            i++;
        }
    }

    static void loopDoWhile(int[] newArray) {
        int i = 0;
        do {
            System.out.println(newArray[i]);
            i++;
        }
        while (i < newArray.length);
    }

}
