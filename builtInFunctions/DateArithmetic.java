package builtInFunctions;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        // Parse the input to LocalDate
        LocalDate inputDate = LocalDate.parse(input);

        // Perform date operations
        LocalDate result = inputDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        // Display the result
        System.out.println("Original Date: " + inputDate);
        System.out.println("Modified Date: " + result);
        
        scanner.close();
    }
}

