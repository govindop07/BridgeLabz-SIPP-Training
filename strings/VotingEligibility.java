package strings;

import java.util.Random;

public class VotingEligibility {
    public static int[] generateAges(int students) {
        Random random = new Random();
        int[] ages = new int[students];

        for (int i = 0; i < students; i++) {
            ages[i] = random.nextInt(30) - 5; 
        }
        return ages;
    }

    // public static void displayResults(int[] ages) {
    //     System.out.println("Student | Age | Can Vote?");
    //     System.out.println("-------------------------");
    //     for (int i = 0; i < ages.length; i++) {
    //         boolean canVote = ages[i] >= 18 && ages[i] > 0;
    //         System.out.printf("%d | %d | %s%n", i + 1, ages[i], (canVote ? "Yes" : "No"));
    //     }
    // }
    public static void displayResults(int[] ages) {
        System.out.println("Student | Age | Can Vote?");
        System.out.println("-------------------------");
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = ages[i] >= 18 && ages[i] > 0;
            System.out.println("Student " + i);
            System.out.println("Age: " + ages[i]);
            System.out.println("Can Vote?: " + (canVote ? " Yes" : " No"));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int students = 10;

        int[] ages = generateAges(students);
        displayResults(ages);
    }
}
