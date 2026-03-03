import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Enter two numbers");
        System.out.println("Enter first number: ");
        int a = nextInt();
        System.out.println("Enter second number: ");
        int b = nextInt();
        Calculater calculater = new Calculater(a, b);
    }
}