package strings;

import java.util.Scanner;

public class LowercaseComparison {
    public static String toLowerCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

        String lowerManual = toLowerCaseManual(text);
        String lowerBuiltIn = text.toLowerCase();

        boolean comparisonResult = compareUsingCharAt(lowerManual, lowerBuiltIn);

        System.out.println("Manual Lowercase Conversion: " + lowerManual);
        System.out.println("Built-in Lowercase Conversion: " + lowerBuiltIn);
        System.out.println("Comparison result: " + comparisonResult);

    }
}
