import java.util.Scanner;

public class CharArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the size of the character array as input
        System.out.print("Enter the number of characters: ");
        int n = scanner.nextInt();

        // Declare the character array
        char[] charArray = new char[n];

        // Input the character elements
        System.out.println("Enter " + n + " characters:");
        for (int i = 0; i < n; i++) {
            charArray[i] = scanner.next().charAt(0); // Read a single character
        }

        // Print the character array
        System.out.print("The characters in the array are: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }

        scanner.close();
    }
}
