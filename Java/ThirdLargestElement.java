import java.util.*;
public class ThirdLargestElement {
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
        int ThirdLargest = Integer.MIN_VALUE;
        for(int i=0;i<n ; i++){
            if(arr[i]>Largest){
                ThirdLargest = secondLargest;
                secondLargest = Largest;
                
                Largest = arr[i];
        }
        else if(arr[i]>secondLargest && arr[i] != Largest){
            ThirdLargest = secondLargest;
            secondLargest = arr[i];
        }
        else if(arr[i]>ThirdLargest && arr[i] != secondLargest && arr[i] != Largest){
            ThirdLargest = arr[i];
        }
        

        }
        if(ThirdLargest == Integer.MIN_VALUE){
            System.out.println("ThirdLargest Element doesn't Exist");
        }
        else{
            System.out.println("ThirdLargest Element = " + ThirdLargest);
        }
        sc.close();
 
    }
    
}
