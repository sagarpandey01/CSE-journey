import java.util.Scanner;

public class TrappingRainWater {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans=0;
        for(int i=1;i<n-1;i++){
            int leftmax=0;
            int rightmax=0;
            for(int j=0;j<i;j++){
                if(arr[j]>leftmax){
                    leftmax=arr[j];
                }
            }
            for(int k=i+1;k<n;k++){
                if(arr[k]>rightmax){
                    rightmax=arr[k];
                }
            }
            int water = Math.min(leftmax,rightmax) - arr[i];
            if(water>0){
                ans=ans+water;
            }
        }
        System.out.println("Total water: " + ans);
        sc.close();
    }
}
