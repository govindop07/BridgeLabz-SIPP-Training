package strings;

import java.util.Arrays;
import java.util.Scanner;

public class SplitComparison {
    public static String[] manualSplit(String text) {
        StringBuilder word = new StringBuilder();
        int count = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        
        String[] words = new String[count + 1];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = word.toString();
                word.setLength(0);
            } else {
                word.append(text.charAt(i));
            }
        }
        words[index] = word.toString();

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] manualWords = manualSplit(text);
        String[] builtInWords = text.split(" ");

        boolean comparisonResult = compareArrays(manualWords, builtInWords);

        System.out.println("Manual Split Words: " + Arrays.toString(manualWords));
        System.out.println("Built-in Split Words: " + Arrays.toString(builtInWords));
        System.out.println("Comparison result: " + comparisonResult);

        scanner.close();
    }
}

