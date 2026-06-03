import java.util.*;
public class MoveZeroesToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Elements of Array");
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<n){
            arr[index]=0;
            index++;
        }
        System.out.println("Array after moving zeroes to end:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " "); 
        }
        sc.close();
    
    }
}
