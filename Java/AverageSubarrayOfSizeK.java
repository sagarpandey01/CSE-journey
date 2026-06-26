import java.util.Scanner;

public class AverageSubarrayOfSizeK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K");
        int k=sc.nextInt();
        for(int i=0;i<=n-k;i++){
            int sum=0;
            float average=0;
            for(int j=i;j<i+k;j++){
                sum=sum+arr[j];
            }
            average=(float)sum/k;
            System.out.print(average + " ");
        }
        sc.close();
    } 
}
