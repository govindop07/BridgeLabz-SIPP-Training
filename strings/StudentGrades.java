package strings;

import java.util.Random;

public class StudentGrades {
    public static int[][] generateScores(int students) {
        Random random = new Random();
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics
            scores[i][1] = 40 + random.nextInt(61); // Chemistry
            scores[i][2] = 40 + random.nextInt(61); // Math
        }
        return scores;
    }

    public static float[] calculatePercentage(int[][] scores) {
        float[] percentages = new float[scores.length];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            percentages[i] = Math.round((total / 3.0f) * 100) / 100.0f;
        }
        return percentages;
    }

    public static char[] assignGrades(float[] percentages) {
        char[] grades = new char[percentages.length];

        for (int i = 0; i < percentages.length; i++) {
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    public static void displayResults(int[][] scores, float[] percentages, char[] grades) {
        System.out.println("Student | Physics | Chemistry | Math | Percentage | Grade");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d | %d | %d | %d | %.2f%% | %c%n",
                              i + 1, scores[i][0], scores[i][1], scores[i][2], percentages[i], grades[i]);
        }
    }

    public static void main(String[] args) {
        int students = 5;

        int[][] scores = generateScores(students);
        float[] percentages = calculatePercentage(scores);
        char[] grades = assignGrades(percentages);

        displayResults(scores, percentages, grades);
    }
}
