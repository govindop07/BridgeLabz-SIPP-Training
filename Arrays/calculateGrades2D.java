package Arrays;

import java.util.*;
public class calculateGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][4]; // 0: Physics, 1: Chemistry, 2: Maths, 3: Percentage
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks (0-100): ");
            double p = sc.nextDouble();
            while (p < 0 || p > 100) {
                System.out.print("Invalid. Enter Physics marks (0-100): ");
                p = sc.nextDouble();
            }

            System.out.print("Enter Chemistry marks (0-100): ");
            double c = sc.nextDouble();
            while (c < 0 || c > 100) {
                System.out.print("Invalid. Enter Chemistry marks (0-100): ");
                c = sc.nextDouble();
            }

            System.out.print("Enter Maths marks (0-100): ");
            double m = sc.nextDouble();
            while (m < 0 || m > 100) {
                System.out.print("Invalid. Enter Maths marks (0-100): ");
                m = sc.nextDouble();
            }

            double percent = (p + c + m) / 3.0;

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
            marks[i][3] = percent;

            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + marks[i][3]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }


    }
}
