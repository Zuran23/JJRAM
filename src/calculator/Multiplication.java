package calculator; // Calculator-related classes.

//By: Max
public class Multiplication {
    // Multiplication operations.
    public double multiply(double a, double b) {
        double result;
        try {
            result = a * b;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Error during Multiplication: " + e.getMessage());
            return 0;
        }
    }
}
