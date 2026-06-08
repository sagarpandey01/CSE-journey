import java.util.Scanner;

public class FirstRepeatElement {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array");
            arr[i] = sc.nextInt();
        }
        int repeating=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    repeating=arr[i];
                    break;
                }
            }
            if(repeating != -1){
                break;
            }
        }
        if(repeating == -1){
            System.out.println("No repeating element found");
        }
        else{
            System.out.println("First Repeating element is: " + repeating);
        }
    }
    
}
