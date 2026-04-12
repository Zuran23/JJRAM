package calculator;

/**
 * Provides addition behavior for the calculator.
 * <p>By: Max</p>
 */
public class Addition {

    /**
     * Adds two double values.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
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
