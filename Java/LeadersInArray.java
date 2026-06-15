import java.util.Scanner;

public class LeadersInArray {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        int[] leaders=new int[n];
        int max=arr[n-1];
        leaders[index++]=max;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                leaders[index++]=arr[i];
            }
        }
        System.out.print("Leaders are: ");
        for(int i=index-1;i>=0;i--){
            System.out.print(leaders[i] + " ");
        }
    }    
}
