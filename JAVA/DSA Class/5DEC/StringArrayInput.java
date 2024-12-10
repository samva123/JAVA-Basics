import java.util.Scanner;

public class StringArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the array size
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        // Declare the string array
        String[] stringArray = new String[n];

        // Input the array elements in one go
        System.out.println("Enter " + n + " strings separated by spaces:");
        String input = scanner.nextLine();
        stringArray = input.split(" ", n); // Split the input by spaces, limited to 'n' strings

        // Print the string array
        System.out.println("The strings in the array are:");
        for (String str : stringArray) {
            System.out.println(str);
        }

        scanner.close();
    }
}
