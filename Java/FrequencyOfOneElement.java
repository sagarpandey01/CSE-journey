import java.util.Scanner;

public class FrequencyOfOneElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the Elements of Arrays");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target who's frequency you have to know");
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
           if(arr[i]==target){
            count++;
           }
        }
        System.out.println("count of target is " + count);
    }
    
}
