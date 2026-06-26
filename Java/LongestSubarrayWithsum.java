import java.util.Scanner;

public class LongestSubarrayWithsum {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K:");
        int k=sc.nextInt();
        int maxlen=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum<=k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        if(maxlen==0){
            System.out.print(0);
        }
        else{
            System.out.print("maximum length: " + maxlen);
        }
        sc.close();
    }
}
