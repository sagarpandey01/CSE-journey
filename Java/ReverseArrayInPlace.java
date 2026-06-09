import java.util.Scanner;

public class ReverseArrayInPlace {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array");
            arr[i] = sc.nextInt();
        }
        int start=0;
        int end = n-1;
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
