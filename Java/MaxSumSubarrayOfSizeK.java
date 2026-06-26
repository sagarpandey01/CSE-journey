import java.util.Scanner;

public class MaxSumSubarrayOfSizeK {
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
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+arr[j];
            }
            max=Math.max(max,sum); 
        }
        System.out.print("maximum Subarray of size k: " + max);
        sc.close();
    }
}
