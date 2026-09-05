import java.util.Scanner;

public class ButterflyTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        for(int i = 1 ;i<=n;i++){
            //upper part
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<= 2 * (n - i);k++){
                System.out.print(" ");

            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
          
        }
        //lower part
        for(int i = n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2 * (n - i); j++) {
              System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                 System.out.print("*");
           }
           System.out.println();
        }
    }
    
}
