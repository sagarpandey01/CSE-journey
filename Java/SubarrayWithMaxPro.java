import java.util.Scanner;

public class SubarrayWithMaxPro {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxproduct=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
                product=product*arr[j];
                if(product>maxproduct){
                    maxproduct=product;
                }
            }
        }
        System.out.print("Maximum product is: " + maxproduct);
        sc.close();
    }
}
