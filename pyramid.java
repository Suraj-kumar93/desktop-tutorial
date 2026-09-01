
// import java.util.Scanner;

// public class pryamid {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         for(int i = 1 ;i<=n;i++){
//             for(int k=n-1;k>=i;k--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }

           
        
//         for(int l=2;l<=i;l++){
//                 System.out.print("*");  
//         }
//         System.out.println();
//         }
//     }
    
// }

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
    

