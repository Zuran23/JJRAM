package calculator;

/**
 * Provides division behavior for the calculator.
 * <p>By: Abdul Rahman Fornah At: afornah1@umbc.edu</p>
 */
public class Division {

    /**
     * Divides the first double by the second double.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a and b
     */
    public double divide(double a, double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error occurred during division: " + e.getMessage());
        }

        return result;
    }
}
