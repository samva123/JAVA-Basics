// import java.util.Scanner;
// public class SQRT {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n ;
//         n = sc.nextInt();
//         int ans = findSqrt(n);
//         System.out.println(ans);
//         sc.close();
//     }

//     public static int findSqrt(int n) {
//         int start = 0;
//         int end = n;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (mid * mid == n) {
//                 return mid;
//             } else if (mid * mid < n) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
    
// }



import java.util.Scanner;

public class SQRT{
    public static void main(String args[]){
        
        Scanner sc  = new Scanner(System.in);

        int n ;
        n  = sc.nextInt();
        double ans = precision(n);
        System.out.printf("%.5f%n", ans);


    }

    public static int find(int n ){
        int start = 0 ;
        int end = n ;

        

        while(start <= end){
            int mid  = start + (end-start)/2;
            
            if(mid * mid == n){
                return mid;
            }
            else if(mid * mid > n){
                end  = mid-1;
            }
            else{
                start  = mid+1;
            }
        }
        return -1;

    }

    public static double precision(int n ){
        int precision  = 5;
        double  step = 0.1;
        double help = find(n);



        for(int  i = 0 ; i < precision ; i++){
            double j = help;

            while(j*j <= n){
                help = j ;
                j += step;
            }
            step /= 10;
        }
        return help;
    }


}
