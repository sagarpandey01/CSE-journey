import java.util.*;
public class AverageOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0; 
        for(int i=0;i<n;i++){
            sum=sum+arr[i];

        }
        double average = (double) sum/n;
        System.out.println(average); 

    }
    
}
