import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HasNext {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        
        while (scanner.hasNext()) {
            // Read the next line and print it with its line number
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
    }
}
}
