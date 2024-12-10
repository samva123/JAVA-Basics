// import java.util.Scanner;

// public class Nine_Dec {
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner (System.in);
//         System.out.println("Enter the number of elements: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n+1];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int value = sc.nextInt();
//         int index = sc.nextInt();

//         for (int i = n; i > index; i--) {
//             arr[i] = arr[i - 1];
//         }
//         arr[index] = value;

//         for (int i = 0; i <= n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
    
// }






// import java.util.Scanner;

// public class Nine_Dec {
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner (System.in);
//         System.out.println("Enter the number of elements: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int value = sc.nextInt();
//         int index = sc.nextInt();

//         for (int i = n-1; i > index; i--) {
//             arr[i] = arr[i - 1];
//         }
//         arr[index] = value;

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
    
// }

import java.util.Scanner;

public class Nine_Dec {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int value = sc.nextInt();
        //int index = sc.nextInt();

        for (int i = n-1; i > value; i--) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
