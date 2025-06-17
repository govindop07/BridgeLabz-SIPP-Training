package Arrays;

import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Create a 2D array: [][0] = height, [][1] = weight, [][2] = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input and validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            double height;
            do {
                System.out.print("Enter height in meters (positive value): ");
                height = sc.nextDouble();
            } while (height <= 0);

            double weight;
            do {
                System.out.print("Enter weight in kg (positive value): ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            double bmi = weight / (height * height);

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f      %.2f      %.2f      %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

    }
}
