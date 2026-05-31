import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the Elements of Array");
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for(int i=0;i<size-1;i++){
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;

            }

        }
        if(sorted){
            System.out.println("sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
        }
}
