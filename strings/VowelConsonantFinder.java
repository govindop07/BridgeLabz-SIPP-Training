package strings;

import java.util.Scanner;

public class VowelConsonantFinder {
    public static String[][] findCharacterType(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);

            ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;

            if ("aeiou".indexOf(ch) != -1) {
                result[i][1] = "Vowel";
            } else if (ch >= 'a' && ch <= 'z') {
                result[i][1] = "Consonant";
            } else {
                result[i][1] = "Not a Letter";
            }
        }
        return result;
    }

    public static void displayResults(String[][] result) {
        for (String[] row : result) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[][] result = findCharacterType(text);
        displayResults(result);

        scanner.close();
    }
}
