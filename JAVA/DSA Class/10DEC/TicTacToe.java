import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int countX = 0, countO = 0;

        System.out.println("Enter the Tic Tac Toe board (use X or O only):");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char input;
                while (true) {
                    
                    input = sc.next().charAt(0);
                    if (input == 'X' || input == 'O') {
                        break;
                    } else {
                        System.out.println("Invalid input! Please enter X or O only.");
                    }
                }
                board[i][j] = input;

                if (input == 'X') countX++;
                if (input == 'O') countO++;
            }
        }

        if (Math.abs(countX - countO) > 1) {
            System.out.println("Invalid board! The difference between X and O is more than 1.");
            return;
        }

        char winner = checkWinner(board);
        if (winner != '_') {
            System.out.println("Winner: " + winner);
        } else {
            System.out.println("No winner is possible.");
        }
    }

    public static char checkWinner(char[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0]; 
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        
        return '_';
    }
}
