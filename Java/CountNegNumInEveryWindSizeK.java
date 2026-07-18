import java.util.Scanner;

public class CountNegNumInEveryWindSizeK {
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
        int k = sc.nextInt();
        int count=0;
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                count++;
            }
        }
        System.out.print(count);
        for(int i=k;i<n;i++){
            if(arr[i]<0){
                count++;
            }
            if(arr[i-k]<0){
                count--;
            }
            System.out.print(" " + count);
        }
        sc.close();
    }
}
