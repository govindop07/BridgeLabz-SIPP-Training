package stringsPracticeProblems;

import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder ans = new StringBuilder();
        boolean[] seen = new boolean[256];
        for(char ch: input.toCharArray()) {
        	if(!seen[ch]) {
        		seen[ch] = true;
        		ans.append(ch);
        	}
        }

        System.out.println("String without duplicates: " + ans);
        sc.close();
    }
}
