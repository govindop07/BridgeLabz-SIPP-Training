package stringsPracticeProblems;

import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (isAnagram(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[256]; // ASCII character set

        for (char ch : s1.toCharArray()) {
            freq[ch]++;
        }

        for (char ch : s2.toCharArray()) {
            freq[ch]--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}


