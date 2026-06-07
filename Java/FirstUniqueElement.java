import java.util.Scanner;

public class FirstUniqueElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array");
            arr[i] = sc.nextInt();
        }
        int unique=-1;
       
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0 ;j<n;j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count==1){
            unique=arr[i];
            break;
        }
        }
        if(unique==-1){
            System.out.println("First unique element doesn't exist");
        }
        else{
            System.out.println("first unique element is: " + unique);
        }
       
    }
    
}
