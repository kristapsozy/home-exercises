package io.codelex.enums.practice.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice = "";
        int userWon = 0;
        int computerWon = 0;
        int totalGames = 0;
        System.out.println("Let us begin...");
        while (true) {
            System.out.println("Scissor-Paper-Stone");
            System.out.println("Your turn (Enter s for scissor, p for paper, r for stone, q to quit):");
            userChoice = scan.nextLine();
            if (userChoice.equals("q")) {
                break;
            }
            System.out.println("Your turn: " + RockPaperScissors.getEnumValueOfShortName(userChoice));
            RockPaperScissors computerChoice = getComputerChoise();
            System.out.println("My turn: " + computerChoice);
            WLT winner = checkForWinner(userChoice, computerChoice);
            if (winner.equals(WLT.WON)) {
                userWon++;
                totalGames++;
            } else if (winner.equals(WLT.LOST)) {
                computerWon++;
                totalGames++;
            } else {
                totalGames++;
            }

        }
        System.out.println("Number of trials: " + totalGames);
        System.out.println("I won " + computerWon + calculateWinPercentage(totalGames, computerWon)
                + ". You won " + userWon + calculateWinPercentage(totalGames, userWon) + ".");
        System.out.println("Bye!");
    }

    public static RockPaperScissors getComputerChoise() {
        Random ran = new Random();
        int number = ran.nextInt(0, 3);
        return RockPaperScissors.values()[number];
    }

    public static WLT checkForWinner(String userChoice, RockPaperScissors computerChoice) {
        if (userChoice.equals("s")) {
            if (computerChoice.equals(RockPaperScissors.PAPER)) {
                System.out.println("You won!");
                return WLT.WON;
            } else if (computerChoice.equals(RockPaperScissors.ROCK)) {
                System.out.println("Rock breaks scissor, I won!");
                return WLT.LOST;
            }
            System.out.println("Tie!");
            return WLT.TIE;
        } else if (userChoice.equals("r")) {
            if (computerChoice.equals(RockPaperScissors.SCISSORS)) {
                System.out.println("You won!");
                return WLT.WON;
            } else if (computerChoice.equals(RockPaperScissors.PAPER)) {
                System.out.println("Paper wraps rock, I won!");
                return WLT.LOST;
            }
            System.out.println("Tie!");
            return WLT.TIE;
        } else if (userChoice.equals("p")) {
            if (computerChoice.equals(RockPaperScissors.ROCK)) {
                System.out.println("You won!");
                return WLT.WON;
            } else if (computerChoice.equals(RockPaperScissors.SCISSORS)) {
                System.out.println("Scissor cuts paper, I won!");
                return WLT.LOST;
            }
            System.out.println("Tie!");
            return WLT.TIE;
        }
        return null;
    }

    public static String calculateWinPercentage(int totalGames, int wonGames) {
        double result = (double) wonGames / totalGames * 100;
        return String.format("(%.2f", result) + "%)";
    }
}
