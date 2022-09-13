package com.bridgelabz;

import java.util.Scanner;

public class BinarySerachWordInList {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Word to find in  sentences");
        String word = scanner.next();
        String[] array = {"pavan", "rohit", "virat", "kisan", "shami"};
        int result = binarySearch(array, word);
        if (result == 1) {
            System.out.println(word +" is  present ");
        } else {
            System.out.println(word +" is Absent");
        }
    }

    public static int binarySearch(String[] array, String key) {
        int first = 0;
        int last = array.length;
        while (first <= last) {
            int mid = (first + last) / 2;
            int compare = key.compareTo(array[mid]);
            if (compare == 0) {
                return 1;
            }
            if (compare > 0) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}
