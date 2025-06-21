package builtInFunctions;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String input1 = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(input1);

        // Prompt the user for the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String input2 = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(input2);

        // Compare the dates
        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2.");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2.");
        } else {
            System.out.println("Both dates are the same.");
        }

        scanner.close();
    }
}
