package methods;

import java.util.Scanner;

public class NaturalSum {
    public static int recSum(int n) {
        if (n == 1) return 1;
        return n + recSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Recursive: " + recSum(n));
        System.out.println("Formula: " + formulaSum(n));
    }
}