package Arrays;

import java.util.*;
public class calculateGrades1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks (0-100): ");
            physics[i] = sc.nextDouble();
            while (physics[i] < 0 || physics[i] > 100) {
                System.out.print("Invalid! Re-enter Physics: ");
                physics[i] = sc.nextDouble();
            }

            System.out.print("Enter Chemistry marks (0-100): ");
            chemistry[i] = sc.nextDouble();
            while (chemistry[i] < 0 || chemistry[i] > 100) {
                System.out.print("Invalid! Re-enter Chemistry: ");
                chemistry[i] = sc.nextDouble();
            }

            System.out.print("Enter Maths marks (0-100): ");
            maths[i] = sc.nextDouble();
            while (maths[i] < 0 || maths[i] > 100) {
                System.out.print("Invalid! Re-enter Maths: ");
                maths[i] = sc.nextDouble();
            }

            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percent[i] >= 80) grade[i] = "A";
            else if (percent[i] >= 70) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 50) grade[i] = "D";
            else if (percent[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Percentage: " + percent[i]);
            System.out.println("Grade: " + grade[i] + "\n");
        }
    }
}
