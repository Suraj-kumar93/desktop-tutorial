
public class binary_search {
    public static int binarysearch(int arr[],int key){
        int start =0;
       int end = arr.length-1;

        while (start<=end) {
            int mid = (start+end)/2;

            //comparison
            if(arr[mid]==key){//found

                return mid;
            }
            if(arr[mid]<key){//right
                start = mid+1;

            }else{//left
                end=mid-1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key = 16;
        
        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();

        System.out.println("index for key is:"+binarysearch(numbers,key));
    }
    
}
