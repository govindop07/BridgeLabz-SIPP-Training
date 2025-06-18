package strings;

import java.util.Scanner;

public class VowelConsonantCount {
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;

            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        int[] counts = countVowelsConsonants(text);

        System.out.println("Total Vowels: " + counts[0]);
        System.out.println("Total Consonants: " + counts[1]);

        scanner.close();
    }
}
