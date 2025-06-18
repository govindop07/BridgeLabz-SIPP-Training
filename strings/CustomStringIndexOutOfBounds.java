package strings;

import java.util.Scanner;

public class CustomStringIndexOutOfBounds {
    public static void generateException(String text) {
        System.out.println("Accessing index beyond string length...");
        System.out.println(text.charAt(text.length())); // This will throw an exception
    }

    public static void handleException(String text) {
        try {
            System.out.println("Accessing index beyond string length...");
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.next();

        handleException(text);
        scanner.close();
    }
}
