package calculator;

/**
 * Provides multiplication behavior for the calculator.
 * <p>By: Max</p>
 */
public class Multiplication {

    /**
     * Multiplies two double values.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
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
