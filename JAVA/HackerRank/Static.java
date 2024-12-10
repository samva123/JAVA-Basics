import java.util.Scanner;

public class Static {
    static int B; // Breadth of the parallelogram
    static int H; // Height of the parallelogram
    static boolean flag = true; // Flag to check validity of B and H

    // Static block to validate B and H
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H; // Calculate area of the parallelogram
            System.out.println(area);
        }
    }
}
