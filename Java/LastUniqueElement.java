import java.util.Scanner;

public class LastUniqueElement {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array");
            arr[i] = sc.nextInt();
        }
        int unique = -1;
        for(int i=arr.length-1;i>=0;i--){
            int count=0;
            for(int j=arr.length-1;j>=0;j--){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
            unique=arr[i];
            break;
            }
        }
        if(unique != -1){
            System.out.println("Last unique Element is: " + unique);
        }
        else{
            System.out.println("Unique Element doesn't exist");
        }
    }
    
}
