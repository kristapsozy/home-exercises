package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    public static char winner = ' ';

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        initBoard();
        while (true) {
            System.out.println("'0' choose your location (rows, column): ");
            displayBoard();
            String userChoiceO = keyboard.nextLine();
            count++;
            board[userChoiceO.charAt(0) - '0'][userChoiceO.charAt(2) - '0'] = 'O';
            if (checkForWinner() == true) {
                System.out.println("Winner is: " + winner);
                break;
            }
            if (count == 9) {
                System.out.println("The game is tie.");
            }
            System.out.println("'X' choose your location (rows, column): ");
            displayBoard();
            String userChoiceX = keyboard.nextLine();
            count++;
            board[userChoiceX.charAt(0) - '0'][userChoiceX.charAt(2) - '0'] = 'X';
            if (checkForWinner() == true) {
                System.out.println("Winner is: " + winner);
                break;
            }

        }

    }


    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static boolean checkForWinner() {
        if (board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            winner = board[0][0];
            return true;
        }
        if (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            winner = board[1][0];
            return true;
        }
        if (board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            winner = board[2][0];
            return true;
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            winner = board[0][0];
            return true;
        }
        if (board[0][1] != ' ' && board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            winner = board[0][1];
            return true;
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            winner = board[0][2];
            return true;
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            winner = board[0][0];
            return true;
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            winner = board[0][2];
            return true;
        } else {
            return false;
        }
    }
}