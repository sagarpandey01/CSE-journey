import java.util.Scanner;

public class MaxSubarraySum {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];

                if(sum>max){
                max=sum;
            }
            }
        }
        System.out.println("Maximum Subarray: " + max);
        sc.close();
    }
}
