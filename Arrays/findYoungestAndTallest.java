package Arrays;

import java.util.*;
public class findYoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ages[] = new int[3];
        int heights[] = new int[3];
        System.out.println("Enter the ages of Amar, Akbar and Anthony: ");
        for(int i=0; i<3; i++) {
            ages[i] = sc.nextInt();
        }
        System.out.println("Enter the heights of Amar, Akbar and Anthony: ");
        for(int i=0; i<3; i++) {
            heights[i] = sc.nextInt();
        }

        int minAgeIdx = 0;
        int maxHeight = 0;
        for(int i=0; i<3; i++) {
            if(ages[i] < ages[minAgeIdx]) minAgeIdx = i;
            if(heights[i] > heights[maxHeight]) maxHeight = i;
        }

        String[] names = {"Amar", "Akbar", "Anthony"};
        System.out.println(names[minAgeIdx] + " has the highest age " + ages[minAgeIdx]);
        System.out.println(names[maxHeight] + " is the tallest friend with height " + heights[maxHeight]);

    }
}
