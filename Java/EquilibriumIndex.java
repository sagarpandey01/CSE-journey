import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<i;j++){
                leftsum=leftsum+arr[j];
            }
            for(int j=i+1;j<n;j++){
                rightsum=rightsum+arr[j];
            }
            if(leftsum==rightsum){
            index=i;
            break;
            }
        }
        System.out.println("Equlibrium index is: " + index);
        sc.close();
    } 
}
