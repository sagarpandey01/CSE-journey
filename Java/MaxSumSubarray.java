import java.util.Scanner;

public class MaxSumSubarray {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int maxSum=sum;
        for(int i=k;i<n;i++){
            sum = sum+arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,sum);
        }
        System.out.println("Maximum sum subarray of Size K: " + maxSum);
        sc.close();
    }
}
