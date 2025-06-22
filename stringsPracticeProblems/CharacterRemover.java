package stringsPracticeProblems;

import java.util.Scanner;

public class CharacterRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != ch)
                result.append(c);
        }

        System.out.println("Modified String: " + result);
        sc.close();
    }
}

