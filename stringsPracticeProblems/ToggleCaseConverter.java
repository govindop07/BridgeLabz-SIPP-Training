package stringsPracticeProblems;

import java.util.Scanner;

public class ToggleCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder toggled = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch))
                toggled.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                toggled.append(Character.toUpperCase(ch));
            else
                toggled.append(ch);
        }

        System.out.println("Toggled string: " + toggled);
        sc.close();
    }
}
