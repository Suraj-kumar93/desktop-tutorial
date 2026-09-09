import java.util.Scanner;

public class linear_search {
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the elements");
        int n=sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        
        // int arr[]={2,3,4,5,6,7,8,9,19};
        
        // int key=8;
        int index = linearsearch(arr, key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("key  is at index:"+ index+1);

        }
        sc.close();
        
    }
    
}
