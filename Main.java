import java.util.Scanner;
import java.util.Random;

/**
 * Main
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class Main {
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';
    /**
     * Entry point of the program. Triggers the computer move.
     */
    public static void main(String[] args) {
        computerMove();
    }
    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                break;
            }
        }
    }
}
