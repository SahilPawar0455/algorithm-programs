package com.bridgelabz;

import java.util.Arrays;

public class AnagramDetection {
    public static void main(String[] args) {
        String word1 = "heart";
        String word2 = "earthf";
        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result = Arrays.equals(arr1, arr2);
        if (result == true) {
            System.out.println("This is the Anagram");
        } else {
            System.out.println("This is Not Anagram");
        }
    }
}
