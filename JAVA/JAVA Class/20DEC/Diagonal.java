import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - i - 1] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
