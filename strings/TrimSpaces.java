package strings;

import java.util.Scanner;

public class TrimSpaces {
    public static String trimUsingCharAt(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        
        return text.substring(start, end + 1);
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
        System.out.print("Enter text with spaces: ");
        String text = scanner.nextLine();

        String trimmedManual = trimUsingCharAt(text);
        String trimmedBuiltIn = text.trim();

        boolean comparisonResult = compareUsingCharAt(trimmedManual, trimmedBuiltIn);

        System.out.println("Manually Trimmed Text: [" + trimmedManual + "]");
        System.out.println("Built-in Trimmed Text: [" + trimmedBuiltIn + "]");
        System.out.println("Comparison result: " + comparisonResult);

        scanner.close();
    }
}

