import java.util.*;
public class DiffOfLargestAndSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Element of Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        int difference=largest-smallest;
        System.out.println("Difference IS: " + difference);
        sc.close();
        
    }
    
}
