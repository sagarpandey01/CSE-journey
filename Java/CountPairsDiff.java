import java.util.Scanner;

public class CountPairsDiff {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value:");
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i]-arr[j])==k){
                   count++;
                   System.out.println("pair: " + arr[i] + "," + arr[j]);
                }
            }
        }
        System.out.println("Number of pairs are: " + count);
        sc.close();
    }
}
