import java.util.Scanner;

public class ProductOfArray {
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
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=0;j<n;j++){
                if(i != j){
                    product=product*arr[j];
                }
            }
            ans[i]=product;
        }
        System.out.print("Answer: ");
        for(int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
