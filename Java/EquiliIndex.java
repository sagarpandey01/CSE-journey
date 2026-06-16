import java.util.Scanner;

public class EquiliIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum += arr[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=totalsum - leftsum - arr[i];
            if(leftsum==rightsum){
                System.out.println("Equilibrium index is: " + i);
                return;
            }
            leftsum += arr[i];
        }
        System.out.println("No equilibrium index");
    } 
}
