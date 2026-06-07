import java.util.*;
public class IndexOfLastEvenElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array");
            arr[i] = sc.nextInt();
        }
        int index=-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]%2==0){
                index=i;
                break;
            }

        } 
        if(index != -1){
            System.out.println("Index of last even element is: " + index);
        }
        else{
            System.out.println("No even Element is found");
        }
    }
    
}
