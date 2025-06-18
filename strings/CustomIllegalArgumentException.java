package strings;
import java.util.Scanner;

public class CustomIllegalArgumentException {
    public static void generateException(String text, int start, int end) {
        System.out.println("Generating substring...");
        System.out.println(text.substring(start, end)); 
    }

    public static void handleException(String text, int start, int end) {
        try {
            System.out.println("Generating substring...");
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        handleException(text, start, end);
        scanner.close();
    }
}
