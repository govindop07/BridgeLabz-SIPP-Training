package strings;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        return choices[random.nextInt(3)];
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) return "Draw";
        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User Wins";
        }
        return "Computer Wins";
    }

    public static void playGame(int rounds) {
        Scanner scanner = new Scanner(System.in);
        int userWins = 0, computerWins = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Round " + i + " - Enter rock, paper, or scissors: ");
            String userChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();

            String result = findWinner(userChoice, computerChoice);

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Result: " + result);

            if (result.equals("User Wins")) userWins++;
            else if (result.equals("Computer Wins")) computerWins++;
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("User Winning Percentage: " + (userWins * 100.0 / rounds) + "%");
        System.out.println("Computer Winning Percentage: " + (computerWins * 100.0 / rounds) + "%");

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rounds: ");
        int rounds = scanner.nextInt();

        playGame(rounds);
        scanner.close();
    }
}

