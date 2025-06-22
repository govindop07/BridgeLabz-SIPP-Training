package stringsPracticeProblems;

import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        String modified = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modified);

        sc.close();
    }

    static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll(oldWord, newWord);
    }
}

