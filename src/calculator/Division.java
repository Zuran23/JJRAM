package calculator; // Calculator-related classes.

// By: Abdul Rahman Fornah At: afornah1@umbc.edu
public class Division { // Placeholder for division behavior.

    // Prints the division result.
    public double divide(double a, double b) {
        double result;
        try {
            result = a / b;
        } catch (ArithmeticException | IllegalArgumentException e) {
            throw new ArithmeticException(e.getMessage());
        }

        return result;
    }

}
