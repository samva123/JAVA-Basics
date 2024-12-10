import java.io.*;
import java.util.*;

public class String_Intro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        // 1. Sum the lengths of A and B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Check lexicographical order
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize the first letter of both A and B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Print both capitalized strings
        System.out.println(capitalizedA + " " + capitalizedB);

        sc.close();
        
    }
}



