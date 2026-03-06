import calculator.Addition;
import calculator.Division;
import calculator.Multiplication;
import calculator.Subtraction;

import java.util.Scanner;

// Entry point for the console app.

void main() {
    Scanner scanner = new Scanner(System.in);
    Addition addition = new Addition();
    Subtraction subtraction = new Subtraction();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();

    // Main menu loop.
    while (true) {
        printMenu();
        int choice = readInt(scanner);

        if (choice == 5) {
            System.out.println("Exit");
            break;
        }

        switch (choice) {
            case 1 -> {
                //System.out.println("\nAddition");
                //double a = readDouble(scanner, "Enter the first number: ");
                //double b = readDouble(scanner, "Enter the second number: ");
                //try {
                    //double result = addition.add(a, b);
                    //System.out.println("Result: " + result);
                //}
                //catch (IllegalArgumentException e){
                    //System.out.println(e.getMessage());
                //}
            }
            case 2 -> {
                System.out.println("\nSubtraction");
                double a = readDouble(scanner, "Enter the first number: ");
                double b = readDouble(scanner, "Enter the second number: ");
                try {
                    double result = subtraction.subtract(a, b);
                    System.out.println("Result: " + result);
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            case 3 -> {
                System.out.println("\nMultiplication");
                double a = readDouble(scanner, "Enter the first number: ");
                double b = readDouble(scanner, "Enter the second number: ");
                try {
                    double result = multiplication.multiply(a, b);
                    System.out.println("Result: " + result);
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            case 4 -> {
                System.out.println("\nDivision");
                double a = readDouble(scanner, "Enter the first number: ");
                double b = readDouble(scanner, "Enter the second number: ");
                try {
                    double result = division.divide(a, b);
                    System.out.println("Result: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            default -> System.out.println("Invalid choice, please select a valid option.");
        }
    }
}

// Prints the menu options.
void printMenu() {
    System.out.println();
    System.out.println("Calculator");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Exit");
}

// Reads a whole number with validation.
int readInt(Scanner scanner) {
    while (true) {
        System.out.print("Select an option (1-5): ");
        String input = scanner.nextLine().trim();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a whole number.");
        }
    }
}

// Reads a decimal number with validation.
double readDouble(Scanner scanner, String prompt) {
    while (true) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
