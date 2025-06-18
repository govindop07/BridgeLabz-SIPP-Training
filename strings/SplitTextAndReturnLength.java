package strings;

import java.util.Scanner;

public class SplitTextAndReturnLength {
    public static String[] splitText(String text) {
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

    public static int findLength(String word) {
        int length = 0;
        try {
            while (true) {
                word.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    public static String[][] generateWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void displayResult(String[][] result) {
        for (String[] row : result) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordLengthArray = generateWordLengthArray(words);

        displayResult(wordLengthArray);

        scanner.close();
    }
}
