package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = keyboard.nextLine();
        System.out.println("First Name: " + firstName);
    }
}
