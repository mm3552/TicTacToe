/**
* TicTacToe
* UC1 initializes and displays an empty Tic-Tac-Toe board in a proper * grid format. This use case introduces 2D arrays, nested loops, * and formatted console output.
*/

public class Main {

    static char[][] board = new char[3][3];

    /**
    * Entry point of the program. It initializes the board and prints * the empty grid on the console.
    */
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    /* 
    Initializes the 3x3 board by filling each cell with '-' to indicate * an empty position. Students should focus on correct nested loop usage.
    */
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    /**
    Prints the Tic-Tac-Toe board using horizontal and vertical separators so that the grid structure is clearly visible to the user.
    */
    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
