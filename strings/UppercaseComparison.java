package strings;

import java.util.Scanner;

public class UppercaseComparison {
    public static String toUpperCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String upperManual = toUpperCaseManual(text);
        String upperBuiltIn = text.toUpperCase();

        boolean comparisonResult = compareUsingCharAt(upperManual, upperBuiltIn);

        System.out.println("Manual Uppercase Conversion: " + upperManual);
        System.out.println("Built-in Uppercase Conversion: " + upperBuiltIn);
        System.out.println("Comparison result: " + comparisonResult);

        scanner.close();
    }
}
