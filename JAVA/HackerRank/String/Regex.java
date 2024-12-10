
import java.io.*;
import java.util.*;

public class Regex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine(); // Reads the input string
        scan.close(); // Closes the scanner (good practice to avoid resource leaks)

        // Check for empty input
        if (s.trim().isEmpty()) {
            System.out.println(0); // If the input is empty or contains only spaces, print 0
            return; // Exit the program
        }

        // Split the string into tokens using a regular expression
        String[] tokens = s.trim().split("[^A-Za-z]+");

        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
