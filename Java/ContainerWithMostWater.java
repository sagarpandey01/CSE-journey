import java.util.Scanner;

public class ContainerWithMostWater {
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
        int left=0;
        int right=n-1;
            while(left<right){
                int water = Math.min(arr[left],arr[right])*(right-left);
                if(water>ans){
                ans=water;
                }
                if(arr[left]<arr[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
        System.out.println("Maximum water: " + ans);
        sc.close();
    }
}
