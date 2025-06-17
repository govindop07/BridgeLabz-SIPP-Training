package Arrays;

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter height: ");
            heights[i] = sc.nextDouble();
            System.out.print("Enter weight: ");
            weights[i] = sc.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5)
                statuses[i] = "Underweight";
            else if (bmis[i] < 24.9)
                statuses[i] = "Normal weight";
            else if (bmis[i] < 29.9)
                statuses[i] = "Overweight";
            else
                statuses[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("height: " + heights[i]+ ", weight: " + weights[i]+ ", bmi: " +  bmis[i]+ ", status: " + statuses[i]);
        }
    }
}
