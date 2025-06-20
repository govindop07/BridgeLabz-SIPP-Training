package methods;

import java.util.*;

public class FriendsComparison {
    public static int findYoungest(int[] ages) {
        return Arrays.stream(ages).min().getAsInt();
    }

    public static int findTallest(int[] heights) {
        return Arrays.stream(heights).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] ages = {24, 22, 25}; // Amar, Akbar, Anthony
        int[] heights = {170, 180, 175};
        System.out.println("Youngest age: " + findYoungest(ages));
        System.out.println("Tallest height: " + findTallest(heights));
    }
}
