package calculator; // Calculator-related classes.
//By: Max

public class Addition { // Placeholder for addition behavior.
    // Addition operations.
    public double add(double a, double b) {
        double result = 0;
        try {
            result = a + b;
        } catch (ArithmeticException e) {
            System.out.println("Error during addition: " + e.getMessage());
        }
        return result;
    }
}
