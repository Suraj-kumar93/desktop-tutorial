import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            for(int k = n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j =1;j<=1;j++){
                    System.out.print("*");
            }
                //System.out.println();
            
            for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
            }
              if(i > 1) {
                for(int m = 1; m <= 1; m++) {
                    System.out.print("*");
                }
            }
           
           System.out.println();
        }
            for (int i = n - 1; i >= 1; i--) {

            // Left spaces
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }

            // First star
            System.out.print("*");
            
            for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
            }
              if(i > 1) {
                for(int m = 1; m <= 1; m++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        
        }
    }
}
