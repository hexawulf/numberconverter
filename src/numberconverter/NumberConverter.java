package numberconverter;

import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Number Base Converter!");

        while (running) {
            System.out.println("\nChoose a conversion:");
            System.out.println("1. Decimal to Binary/Hex/Octal");
            System.out.println("2. Binary to Decimal");
            System.out.println("3. Hexadecimal to Decimal");
            System.out.println("4. Octal to Decimal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a decimal number: ");
                    int decimal = scanner.nextInt();
                    if (decimal < 0) {
                        System.out.println("Please enter a non-negative number!");
                        break;
                    }
                    System.out.println("Binary: " + Integer.toBinaryString(decimal));
                    System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                    System.out.println("Octal: " + Integer.toOctalString(decimal));
                    break;

                case 2:
                    System.out.print("Enter a binary number: ");
                    String binary = scanner.next();
                    try {
                        int decFromBin = Integer.parseInt(binary, 2);
                        System.out.println("Decimal: " + decFromBin);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary number! Use only 0s and 1s.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a hexadecimal number: ");
                    String hex = scanner.next();
                    try {
                        int decFromHex = Integer.parseInt(hex, 16);
                        System.out.println("Decimal: " + decFromHex);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid hex number! Use 0-9 and A-F.");
                    }
                    break;

                case 4:
                    System.out.print("Enter an octal number: ");
                    String octal = scanner.next();
                    try {
                        int decFromOct = Integer.parseInt(octal, 8);
                        System.out.println("Decimal: " + decFromOct);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid octal number! Use 0-7.");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Thanks for using the Number Base Converter!");
                    break;

                default:
                    System.out.println("Invalid choice! Pick 1-5.");
            }
        }
        scanner.close();
    }
}