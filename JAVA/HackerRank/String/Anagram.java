
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
    // Step 1: Check if lengths are equal
    if (a.length() != b.length()) {
        return false;
    }

    // Step 2: Convert to lowercase
    a = a.toLowerCase();
    b = b.toLowerCase();

    // Step 3: Create frequency arrays for both strings
    int[] frequency = new int[26]; // For lowercase English letters

    for (int i = 0; i < a.length(); i++) {
        frequency[a.charAt(i) - 'a']++;
        frequency[b.charAt(i) - 'a']--;
    }

    // Step 4: Check if all counts are zero
    for (int count : frequency) {
        if (count != 0) {
            return false;
        }
    }

    return true;
}


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



// static boolean isAnagram(String a, String b) {
//     // Step 1: Check if lengths are equal
//     if (a.length() != b.length()) {
//         return false;
//     }

//     // Step 2: Convert to lowercase and sort characters
//     char[] aArray = a.toLowerCase().toCharArray();
//     char[] bArray = b.toLowerCase().toCharArray();

//     java.util.Arrays.sort(aArray);
//     java.util.Arrays.sort(bArray);

//     // Step 3: Compare sorted arrays
//     return java.util.Arrays.equals(aArray, bArray);
// }

