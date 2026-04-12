package calculator;

/**
 * Provides subtraction behavior for the calculator.
 * <p>By: Abdul Rahman Fornah At: afornah1@umbc.edu</p>
 */
public class Subtraction {

    /**
     * Subtracts the second double from the first double.
     *
     * @param a the first number (minuend)
     * @param b the second number (subtrahend)
     * @return the difference of a and b
     */
    public double subtract(double a, double b) {
        double result = 0;
        try {
            result = a - b;
        } catch (IllegalArgumentException e) {
            System.out.println("Error occurred during subtraction: " + e.getMessage());
        }

        return result;
    }
}
