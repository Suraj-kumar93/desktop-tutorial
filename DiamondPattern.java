import java.util.Scanner;

public class DiamondPattern {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

       
        for(int i = 1 ;i<=n;i++){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
              for(int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
        
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
