package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        primeNumber(number);
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
}
