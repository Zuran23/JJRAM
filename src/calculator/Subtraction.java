package calculator; // Calculator-related classes.

public class Subtraction { // Placeholder for subtraction behavior.
    // Prints the subtraction result.
    public void subtract(double a, double b) {
        double result = 0;
        try {
            result = a - b;
        } catch (Exception e) {
            System.out.println("Error occurred during subtraction: " + e.getMessage());
        } finally {
            System.out.println("Subtraction: " + result);
        }

    }
}
