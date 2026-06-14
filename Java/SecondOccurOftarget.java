import java.util.Scanner;

public class SecondOccurOftarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int count=0;
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
            if(count==2){
            index=i;
            break;
        }
        }
        if(index != -1){
            System.out.println("Target secondOccurence index is: " + index);
        }
        else{
            System.out.println("target SecondOccurence doesn't found");
        }
    }
    
}
