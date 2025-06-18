package strings;

import java.util.Scanner;

public class CustomNumberFormatException {
    public static void generateException(String text) {
        System.out.println("Parsing Integer from text...");
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
    }

    public static void handleException(String text) {
        try {
            System.out.println("Parsing Integer from text...");
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number string: ");
        String text = sc.next();
        
        handleException(text);
    }
}

