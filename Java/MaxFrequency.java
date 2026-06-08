import java.util.Scanner;

public class MaxFrequency {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int element = -1;
        int maxfre=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxfre){
                maxfre=count;
                element=arr[i];
            }
        }
        if(element != -1){
        System.out.println("Element of max freq is: " + element);
        }
    }
    
}
