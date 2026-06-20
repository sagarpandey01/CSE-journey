import java.util.Scanner;

public class LongestConsecutiveOnes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
            if(arr[j]==1){
                count++;
            }
            else if(arr[j] != 1){
                break;
            }
        }
        if(count>max){
            max=count;
        }
    }
    System.out.println("Longest Consecutive Ones is: " + max);
    sc.close();
    }
}
