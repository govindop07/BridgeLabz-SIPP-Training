package stringsPracticeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        for(char ch: input.toCharArray()) {
        	map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        int max = 0;
        char ans = ' ';
        for(int i=0; i<map.size(); i++) {
        	int cur = map.get(input.charAt(i));
        	max = Math.max(max, cur);
        	if(max == cur) ans = input.charAt(i);
        }

        System.out.println("Most Frequent Character: '" + ans + "'");
        sc.close();
    }
}

