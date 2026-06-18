import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int need=n/2;
        for(int i=0;i<n;i++){
            boolean alreadycount=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    alreadycount=true;
                    break;
                }
            }
            if(alreadycount){
                continue;
            }
            int count=0;
            for(int k=0;k<n;k++){
                if(arr[i]==arr[k]){
                    count++;
                }
            }
            if(count>need){
            System.out.println("Majority Element is: " + arr[i]);  
            break;            
            }
        }
    }    
}
