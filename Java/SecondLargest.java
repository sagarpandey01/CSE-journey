import java.util.*;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array");
            arr[i] = sc.nextInt();
        } 
        int Largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<n ; i++){
            if(arr[i]>Largest){
                secondLargest = Largest;
                Largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i] != Largest){
                secondLargest=arr[i];
            }

        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("SecondLargest Element doesn't Exist");

        }
        else{
            System.out.println("SecondLargest Element is " + secondLargest);
        }
        sc.close();
    }
    
}
