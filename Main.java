import java.util.Random;

/**
* TicTacToe
* UC2 performs a random toss to decide who plays first and assigns 
* symbols (X or 0) to the human and computer accordingly.
*/

public class Main {
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
    * Entry point of the program. Executes the toss logic and displays 
    * the result of turn and symbol assignment.
    */
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }
    /**
    * Uses random logic to decide the first player and assigns symbols 
    * based on the toss outcome. This method initializes the game state.
    */
    static void tossAndAssignSymbols() {
        Random rand = new Random();
        boolean toss = rand.nextBoolean();

        if (toss) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human plays first");
        } else {
            System.out.println("Computer plays first");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}
