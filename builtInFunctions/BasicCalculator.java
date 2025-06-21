package builtInFunctions;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = performOperation(num1, num2, operator);
        System.out.println("Result: " + result);

        scanner.close();
    }

    static double performOperation(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return (b != 0) ? a / b : Double.NaN;
            default: return Double.NaN;
        }
    }
}
