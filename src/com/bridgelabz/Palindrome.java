package com.bridgelabz;

import java.util.Scanner;

public class Palindrome {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        System.out.println("Check the number is prime or not");
        primeNumber(number);
        System.out.println("Check the number is palindrome or not");
        palindrome(number);
    }

    private static void primeNumber(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("This is not prime number");
                return;
            }
        }
        System.out.println("This is prime Number");
    }
    public static void palindrome(int number){
        int sum =0;
        int remainder;
        int reverse = number;
        while (number>0){
            remainder = number%10;
            sum = (sum*10)+remainder;
            number= number/10;
        }
        if (reverse==sum){
            System.out.println("This is Palindrome Number");
        }else {
            System.out.println("This is not Palindrome Number");
        }
    }
}
