import java.util.Scanner;

public class FirstElementToRepeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array");
            arr[i] = sc.nextInt();
        }
        int repeat=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    repeat=arr[i];
                    break;
                }
            }
            if(repeat != -1 ){
                break;
            }
        }
        if(repeat != -1){
            System.out.println("First repeat Element is: " + repeat);
        }
        else{
            System.out.println("Repeat Element doesn't Exist");
        }
    }
    
}
