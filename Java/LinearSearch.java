import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the Elements of Array");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number that you have to search");
        int target = sc.nextInt();
        boolean found = false;
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                found = true;
                break;
            }
          
            
        }
        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        
        
    }
    
}
