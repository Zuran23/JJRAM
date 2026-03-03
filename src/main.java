import calculator.Division;

// Entry point class for the console app.

void main() { // Program start.
    Scanner scanner = new Scanner(System.in); // Read input from the console.
    int choice = 0; // Store the user's menu choice.
    boolean calcOpen = true; // Control the main menu loop.

    while (calcOpen) { // Keep showing the menu until an exit is chosen.
        System.out.println("\n");
        System.out.println("Calculator"); // Menu title.
        System.out.println("1. Addition"); // Option 1.
        System.out.println("2. Subtraction"); // Option 2.
        System.out.println("3. Multiplication"); // Option 3.
        System.out.println("4. Division"); // Option 4.
        System.out.println("5. Exit" + "\n"); // Option 5.

        try {
            choice = scanner.nextInt();// Read the user's selection.
        } catch (Exception e) {
            System.out.println("Invalid input please enter a number form 1 - 5");
            break;
        } finally {
            switch (choice) { // Execute based on the selection.
                case 1: // Addition option.
                    System.out.println("Addition");// Placeholder output.
                    break; // End case.
                case 2: // Subtraction option.
                    System.out.println("Subtraction"); // Placeholder output.
                    break; // End case.
                case 3: // Multiplication option.
                    System.out.println("Multiplication"); // Placeholder output.
                    break; // End case.
                case 4: // Division option.
                    System.out.println("Division" + "\n");
                    System.out.print("Enter the first division number: ");
                    int a = 0;
                    try {
                        a = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input please enter a number");
                        scanner.next();
                    }
                    System.out.print("Enter the second division number: ");
                    int b = 0;
                    try {
                        b = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input please enter a number");
                        scanner.next();
                    }
                    Division div = new Division();
                    div.divide(a,b);

                    break; // End case.
                case 5: // Exit option.
                    System.out.println("Exit"); // Notify user.
                    calcOpen = false; // Stop the loop.
            }
        }


    }
}

