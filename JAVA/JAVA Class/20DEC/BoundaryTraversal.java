import java.util.*;

public class BoundaryTraversal {
    public static void boundaryTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // If only one row
        if (rows == 1) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[0][j] + " ");
            }
        }
        // If only one column
        else if (cols == 1) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][0] + " ");
            }
        }
        // General case
        else {
            // Top row
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[0][j] + " ");
            }

            // Right column
            for (int i = 1; i < rows; i++) {
                System.out.print(matrix[i][cols - 1] + " ");
            }

            // Bottom row (if not the same as top row)
            if (rows > 1) {
                for (int j = cols - 2; j >= 0; j--) {
                    System.out.print(matrix[rows - 1][j] + " ");
                }
            }

            // Left column (if not the same as right column)
            if (cols > 1) {
                for (int i = rows - 2; i > 0; i--) {
                    System.out.print(matrix[i][0] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println("Boundary Traversal of the Matrix:");
        boundaryTraversal(matrix);
    }
}
