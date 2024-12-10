import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.err.println(arr[i]);
        }

        int sum = 0;
        for (int num : arr) {
            if(num%2 == 0 || num%5 ==0){
                sum += num;
            }   
        }
        System.out.println("The sum of the array elements is: " + sum);

        scanner.close();
    }
}
