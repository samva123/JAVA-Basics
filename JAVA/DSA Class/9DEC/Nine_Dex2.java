//package DSA Class;
import java.util.Scanner;

public class Nine_Dex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];



        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0 ;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of the array elements is: " + sum);
    }
    
}
