package com.bridgelabz;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexContact {
    static Scanner scanner = new Scanner(System.in);
    static  String Name = "name";
    static String FullName = "full name";
    static String Number = "xxxxxxxxxx";
    static  String Date = "01/01/2016";

    public static void main(String[] args) {
        messages();
        firstName();
        fullName();
        number();
        date();
        messages();
    }

    private static void date() {
        LocalDate localDate = LocalDate.now();
        Date = String.valueOf(localDate);
    }

    private static void number() {
        System.out.println("Enter the Mobile Number");
        String number = scanner.next();
        String regex  = "[789]{1}[0-9]{9}";
        boolean result = (Pattern.matches("[789]{1}[0-9]{9}", number));
        if (result){
            Number = number;
        }else {
            System.out.println("Invalid Number, please try again");
            number();
        }
    }

    private static void fullName() {
        System.out.println("Enter the Full Name");
        String fullName = scanner.nextLine();
        boolean result = (Pattern.matches("[a-zA-z ]{10,30}", fullName));
        if (result){
            FullName = fullName;
        }else {
            System.out.println("Invalid Full Name please try again");
            fullName();
        }
    }

    public static void firstName() {
        System.out.println("Enter the First Name");
        String name = scanner.next();
        boolean result = (Pattern.matches("[a-zA-z\\d]{2,10}", name));
        if (result){
            Name = name;
        }else {
            System.out.println("Invalid Name please try again");
            firstName();
        }
    }
    public static void messages(){
        System.out.println("Read in the following message: Hello <<"+Name+">>, We have your full\n" +
                "name as <<"+FullName+">> in our system. your contact number is 91-"+ Number +".\n" +
                "Please,let us know in case of any clarification Thank you BridgeLabz "+Date+".");
    }
}
