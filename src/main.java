import java.util.Scanner; // Scanner for user input.

public class main { // Entry point class for the console app.
    public static void main(String[] args) { // Program start.
        Scanner scanner = new Scanner(System.in); // Read input from the console.
        int choice; // Store the user's menu choice.
        boolean calcOpen = true; // Control the main menu loop.

        while (calcOpen) { // Keep showing the menu until exit is chosen.
            System.out.println("Calculator"); // Menu title.
            System.out.println("1. Addition"); // Option 1.
            System.out.println("2. Subtraction"); // Option 2.
            System.out.println("3. Multiplication"); // Option 3.
            System.out.println("4. Division"); // Option 4.
            System.out.println("5. Exit"); // Option 5.

            choice = scanner.nextInt(); // Read the user's selection.

            switch (choice) { // Execute based on the selection.
                case 1: // Addition option.
                    System.out.println("Addition"); // Placeholder output.
                    break; // End case.
                case 2: // Subtraction option.
                    System.out.println("Subtraction"); // Placeholder output.
                    break; // End case.
                case 3: // Multiplication option.
                    System.out.println("Multiplication"); // Placeholder output.
                    break; // End case.
                case 4: // Division option.
                    System.out.println("Division"); // Placeholder output.
                    break; // End case.
                case 5: // Exit option.
                    System.out.println("Exit"); // Notify user.
                    calcOpen = false; // Stop the loop.
            }
        }
    }
}
