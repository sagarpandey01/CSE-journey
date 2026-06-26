import java.util.Scanner;

public class FirstNegNumOfSizeK {
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
            boolean found=false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    System.out.print(arr[j] + " ");
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.print(0 + " ");
            }
        }
        sc.close();
    }
}
