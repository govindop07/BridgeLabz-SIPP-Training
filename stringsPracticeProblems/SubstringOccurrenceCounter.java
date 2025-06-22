package stringsPracticeProblems;

import java.util.Scanner;

public class SubstringOccurrenceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter the substring to count: ");
        String subStr = sc.nextLine();

        int count = 0;
        int len = subStr.length();
        for(int i=0; i<=mainStr.length()-len; i++) {
        	if(mainStr.substring(i, i+len).equals(subStr)) count++;
        }

        System.out.println("Occurrences: " + count);
        sc.close();
    }
}
