import java.util.Scanner;

public class MaximumSubarray {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                ans=Math.max(ans,sum);
            }
        }
        for(int del=0;del<n;del++){
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=i;j<n;j++){
                    if(j==del){
                        continue;
                    }
                    sum += arr[j];
                    ans=Math.max(ans,sum);
                }
            }
        }
        System.out.println("Maximum sum: " + ans);
        sc.close();
    }
}
