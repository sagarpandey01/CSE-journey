import java.util.Scanner;

public class MaximumSubarraySum {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<n;i++){
            currsum=Math.max(arr[i],currsum+arr[i]);
            maxsum=Math.max(maxsum,currsum);
        }
        System.out.println("Maximum Subarray: " + maxsum);
        sc.close();
    }
}
