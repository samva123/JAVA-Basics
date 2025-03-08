import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the board : ");
        int size = sc.nextInt();

        char[][] board = new char[size][size];
        int countX = 0, countO = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char input;
                while (true) {
                    System.out.print("Enter value for position (" + i + ", " + j + "): ");
                    input = sc.next().charAt(0);
                    if (input == 'X' || input == 'O') {
                        break;
                    } else {
                        System.out.println("Invalid input! Please enter X or O only.");
                    }
                }
                board[i][j] = input;

                // Count X and O
                if (input == 'X') countX++;
                if (input == 'O') countO++;
            }
        }
        sc.close();

        if (Math.abs(countX - countO) > 1) {
            System.out.println("Invalid board! The difference between X and O is more than 1.");
            return;
        }
        char winner = checkWinner(board, size);
        if (winner != '_') {
            System.out.println("Winner: " + winner);
        } else {
            System.out.println("No winner is possible.");
        }
        sc.close();
    }

    public static char checkWinner(char[][] board, int size) {
        // Check rows
        for (int i = 0; i < size; i++) {
            boolean winnerRow = true;
            for (int j = 1; j < size; j++) {
                if (board[i][j] != board[i][j - 1]) {
                    winnerRow = false;
                    break;
                }
            }
            if (winnerRow) {
                return board[i][0];
            }
        }

        // Check columns
        for (int i = 0; i < size; i++) {
            boolean winnerColumn = true;
            for (int j = 1; j < size; j++) {
                if (board[j][i] != board[j - 1][i]) {
                    winnerColumn = false;
                    break;
                }
            }
            if (winnerColumn) {
                return board[0][i];
            }
        }

        // Check diagonals
        boolean winnerDiagonal1 = true;
        boolean winnerDiagonal2 = true;
        for (int i = 1; i < size; i++) {
            if (board[i][i] != board[i - 1][i - 1]) {
                winnerDiagonal1 = false;
            }
            if (board[i][size - 1 - i] != board[i - 1][size - i]) {
                winnerDiagonal2 = false;
            }
        }

        if (winnerDiagonal1) return board[0][0]; 
        if (winnerDiagonal2) return board[0][size - 1];

        // No winner found
        return '_'; // No winner
    }
}
