import java.util.Scanner;

public class PairWithGivenSum {
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the Elements of Arrays");
           arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target");
        int target=sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                System.out.println("pair is: " + arr[i] + " " + arr[j]);
                }
            }

        }
    }
    
}
