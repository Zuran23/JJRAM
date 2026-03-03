package calculator; // Calculator-related classes.

public class Calculater { // Base class holding operands.
    private int a; // First operand.
    private int b; // Second operand.

    public Calculater() { // Default constructor.
    }

    public Calculater(int a, int b) { // Initialize both operands.
        this.a = a; // Set first operand.
        this.b = b; // Set second operand.
    }

    public int getA() { // Get first operand.
        return a; // Return value.
    }

    public int getB() { // Get second operand.
        return b; // Return value.
    }
}
