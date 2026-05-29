import java.util.*;
public class CountEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter the elements of arrays");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                count++;
}

        }
        System.out.println("Number of even digit is " + count);
    }
    
}
