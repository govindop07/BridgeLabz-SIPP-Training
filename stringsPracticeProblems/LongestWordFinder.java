package stringsPracticeProblems;

import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine() + " ";

        String cur = "", largest = "";
        for (char i : input.toCharArray()) {
        	if(i == ' ') {
        		if(cur.length() > largest.length()) {
        			largest = cur;
        		}
        		cur = "";
        	}
        	else cur += i;
        }

        System.out.println("Longest word: " + largest);
        sc.close();
    }
}
