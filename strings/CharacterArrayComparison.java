package strings;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterArrayComparison {
    public static char[] extractCharacters(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.next();

        char[] manualArray = extractCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean comparisonResult = compareArrays(manualArray, builtInArray);

        System.out.println("Manual Character Extraction: " + Arrays.toString(manualArray));
        System.out.println("Built-in Character Extraction: " + Arrays.toString(builtInArray));
        System.out.println("Comparison result: " + comparisonResult);

        scanner.close();
    }
}
