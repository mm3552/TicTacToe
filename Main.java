import java.util.Scanner;
import java.util.Random;

/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class Main {
    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    /**
     * Entry point of the program. Demonstrates the structure
     * of a continuous game loop.
     */
    public static void main(String[] args) {
        while (!gameOver) {
            if (isHumanTurn) {
                System.out.println("Human Turn");
            } else {
                System.out.println("Computer Turn");
            }

            gameOver = true;
            isHumanTurn = !isHumanTurn;
        }
    }
}
