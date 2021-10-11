package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class ElementFiltering {

    public static void main(String[] args) {
        int[] newArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5, -4, 9};
        negative(newArray);
        odd(newArray);
        duplicates(newArray);
        printEverySecond(newArray);
        averageValue(newArray);
    }

    static void averageValue (int[] newArray) {
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }
        double average = sum / newArray.length;
        System.out.print("\n Average value is: " + average);
        int counter = 0;
        for (int i = 0; i < newArray.length; i++){
            if (newArray[i] < average) {
                counter ++;
            }
        }
        System.out.print("\n Number of elements that are smaller than average value: " + counter);
    }

    static void printEverySecond (int[] newArray) {
        System.out.print("\n Every second element: ");
        for (int i = 0; i < newArray.length; i = i + 2) {
            System.out.print(" " + newArray[i] + " ");
        }
    }

    static void negative(int[] newArray) {
        System.out.print("\n Negative elements are: ");
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 0) {
                System.out.print(" " + newArray[i] + " ");
            }
        }
    }

    static void odd(int[] newArray) {
        int counter = 0;
        System.out.print("\n Odd elements are: ");
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 != 0) {
                System.out.print(" " + newArray[i] + " ");
                counter ++;
            }
        }
        System.out.print("\n Count of odd elements: " + counter);
    }

    static void duplicates(int[] newArray) {
        Set<Integer> set = new HashSet<Integer>();
        int counter = 0;
        for (Integer value : newArray) {
            if (!set.add(value)) {
                counter ++;
            }
        }
        System.out.print("\n Count of elements with duplicate values: " + counter);
    }

}
