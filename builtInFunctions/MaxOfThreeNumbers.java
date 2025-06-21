package builtInFunctions;

import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        int[] numbers = takeInput();
        int max = findMax(numbers[0], numbers[1], numbers[2]);
        System.out.println("Maximum of the three numbers is: " + max);
    }

    static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        return nums;
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

