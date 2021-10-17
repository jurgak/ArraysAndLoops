package com.company;

import java.util.Scanner;

public class gradeArray {

    public static void main(String[] args) {
        byte[] gradeArray = new byte[10];
        fillArray(gradeArray);
        failedOrA(gradeArray);
        histogram(gradeArray);
    }

    static void fillArray(byte[] gradeArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("You will have to enter the grades for " + gradeArray.length + " students in total.");
        int i;
        for (i = 0; i < gradeArray.length; i++) {
            int studentNo = i + 1;
            System.out.print("Please enter the grade for Student " + studentNo + ": ");
            checkValidity(input);
            byte grade = input.nextByte();
            if (grade < 0 || grade > 10) {
                System.out.print("Grade must be between 0 and 10. Try again: ");
                input.next();
            }
            gradeArray[i] = grade;
        }

    }

    static void checkValidity(Scanner input) {
        while (!input.hasNextByte()) {
            System.out.print("That's not a number! Try again: ");
            input.next();
        }
    }

    static void failedOrA(byte[] gradeArray) {
        int counterF = 0;
        int counterA = 0;
        for (byte b : gradeArray) {
            if (b < 4) {
                counterF++;
            }
            if (b == 10) {
                counterA++;
            }
        }
        System.out.println("The number of students who failed is: " + counterF);
        System.out.println("The number of students who got A is: " + counterA);
    }

    static void histogram(byte[] gradeArray) {
        byte gradeV = 0;
        while (gradeV <= 10) {
            int studentCount = 0;
            for (byte grade : gradeArray) {
                if (grade == gradeV) {
                    studentCount++;
                }
            }
            System.out.println(studentCount + " students with the grade " + gradeV);
            gradeV++;
        }
    }
}

