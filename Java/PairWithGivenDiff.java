import java.util.Scanner;

public class PairWithGivenDiff {
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
        boolean found=false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]-arr[j]==k || arr[j]-arr[i]==k){
                    System.out.println("Yes");
                    System.out.println("pairs are: " + arr[i] + " and " + arr[j]);
                    found=true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("No pairs found");
        }
        sc.close();
    }
}
