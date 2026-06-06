import java.util.*;
public class ElementGreaterThanAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        double average=0;
        int count=0;
        for(int i=0;i<n;i++){
                sum=sum+arr[i];
        }
        average = (double)sum/n;
        for(int i=0;i<n;i++){
        if(arr[i]>average){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
