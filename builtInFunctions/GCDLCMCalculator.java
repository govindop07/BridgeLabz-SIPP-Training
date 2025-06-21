package builtInFunctions;

import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        scanner.close();
    }

    static int calculateGCD(int a, int b) {
    	int min = Math.min(a, b);
        for(int i=min; i>=0; i--) {
        	if(a % i == 0 && b % i == 0) return i;
        }
        return 1;
    }

    static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}

