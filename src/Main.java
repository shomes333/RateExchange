package com.conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        com.conversor.Conversor conversor = new com.conversor.Conversor();
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("\n" +
                "****************************************\n" +
                "*                                      *\n" +
                "*      Welcome to your Currency        *\n" +
                "*             Converter!               *\n" +
                "*                                      *\n" +
                "****************************************");
        do {
            conversor.showMenu();
            System.out.print("\nPlease choose an option: ");
            option = scanner.nextInt();
            if (option >= 1 && option <= 6) {
                System.out.print("Enter the value to convert:");
                double value = scanner.nextDouble();
                conversor.convert(option,
                        value);
            }else if (option != 7) {
                System.out.print("\nWRONG OPTION, PLEASE TRY AGAIN\n");
            }
        } while (option != 7);
        System.out.println("\n" +
                "****************************************\n" +
                "*                                      *\n" +
                "*   Thank you for using our services!  *\n" +
                "*                                      *\n" +
                "****************************************");
    }
}