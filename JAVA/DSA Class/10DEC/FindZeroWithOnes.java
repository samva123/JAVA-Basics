import java.util.Scanner;




public class FindZeroWithOnes {

    public static void findZeroWithOnes(int[][] matrix, int rows, int cols) {

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (matrix[i][j] == 0 
                        && matrix[i - 1][j] == 1  // Check above
                        && matrix[i + 1][j] == 1  // Check below
                        && matrix[i][j - 1] == 1  // Check left
                        && matrix[i][j + 1] == 1) { // Check right
                    System.out.println("Zero with 1s in all directions found at: (" + i + ", " + j + ")");
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        findZeroWithOnes(matrix, rows, cols);

        scanner.close();
    }

    
}
