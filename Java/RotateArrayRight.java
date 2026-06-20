import java.util.Scanner;

public class RotateArrayRight {
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
        int k=sc.nextInt();
        for(int r=0;r<k;r++){
            int temp=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
