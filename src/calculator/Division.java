package calculator; // Calculator-related classes.

// By: Abdul Rahman Fornah At: afornah1@umbc.edu
public class Division { // Placeholder for division behavior.

    // Prints the division result.
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
