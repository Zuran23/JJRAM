package calculator; // Calculator-related classes.

// By: Abdul Rahman Fornah At: afornah1@umbc.edu
public class Subtraction { // Placeholder for subtraction behavior.
    // Prints the subtraction result.
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
