package numberconverter;

import java.util.Scanner;

public class NumberConverterEnhanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Number Base Converter!");

        while (running) {
            displayMenu();
            int choice = getValidChoice(scanner);

            switch (choice) {
                case 1:
                    convertDecimal(scanner);
                    break;
                case 2:
                    convertBinary(scanner);
                    break;
                case 3:
                    convertHexadecimal(scanner);
                    break;
                case 4:
                    convertOctal(scanner);
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

    private static void displayMenu() {
        System.out.println("\nChoose a conversion:");
        System.out.println("1. Decimal to Binary/Hex/Octal");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Hexadecimal to Decimal");
        System.out.println("4. Octal to Decimal");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

    private static int getValidChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter your choice (1-5): ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void convertDecimal(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a decimal number: ");
            scanner.next();
        }
        int decimal = scanner.nextInt();
        if (decimal < 0) {
            System.out.println("Please enter a non-negative number!");
            return;
        }
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
        System.out.println("Octal: " + Integer.toOctalString(decimal));
    }

    private static void convertBinary(Scanner scanner) {
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        if (!binary.matches("[01]+")) {
            System.out.println("Invalid binary number! Use only 0s and 1s.");
            return;
        }
        int decFromBin = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decFromBin);
    }

    private static void convertHexadecimal(Scanner scanner) {
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.next();
        if (!hex.matches("[0-9A-Fa-f]+")) {
            System.out.println("Invalid hex number! Use 0-9 and A-F.");
            return;
        }
        int decFromHex = Integer.parseInt(hex, 16);
        System.out.println("Decimal: " + decFromHex);
    }

    private static void convertOctal(Scanner scanner) {
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        if (!octal.matches("[0-7]+")) {
            System.out.println("Invalid octal number! Use 0-7.");
            return;
        }
        int decFromOct = Integer.parseInt(octal, 8);
        System.out.println("Decimal: " + decFromOct);
    }
}
