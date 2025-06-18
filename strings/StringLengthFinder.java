package strings;

import java.util.Scanner;

public class StringLengthFinder {
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.next();

        int manualLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Manual Length Calculation: " + manualLength);
        System.out.println("Built-in Length Calculation: " + builtInLength);
        System.out.println("Results match: " + (manualLength == builtInLength));

        scanner.close();
    }
}
