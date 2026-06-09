import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array");
            arr[i] = sc.nextInt();
        }
        int first=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<n;i++){
            arr[n-1]=first;
            System.out.print(arr[i] + " ");
        }
    }
    
}
