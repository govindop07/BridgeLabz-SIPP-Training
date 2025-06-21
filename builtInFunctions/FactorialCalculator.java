package builtInFunctions;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int num = scanner.nextInt();
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
        scanner.close();
    }

    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}

