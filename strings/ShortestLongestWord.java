package strings;

import java.util.Scanner;

public class ShortestLongestWord {
    public static String[] splitText(String text) {
        return text.split(" ");
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

    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            if (findLength(word) < findLength(shortest)) {
                shortest = word;
            }
            if (findLength(word) > findLength(longest)) {
                longest = word;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[] result = findShortestLongest(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        scanner.close();
    }
}

