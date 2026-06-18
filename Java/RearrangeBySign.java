import java.util.Scanner;

public class RearrangeBySign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos += 2;
            }
            else if(arr[i]<0){
                ans[neg]=arr[i];
                neg += 2;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }   
}
