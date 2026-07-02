import java.util.Scanner;

public class SmallestSubarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target:");
        int k=sc.nextInt();
        int start=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        for(int end=0;end<n;end++){
            sum += arr[end];

            while(sum>k){
                minlen=Math.min(minlen,end-start+1);
                sum -= arr[start];
                start++;
            }
        }
        System.out.println(minlen==Integer.MAX_VALUE ? 0 : minlen);
        sc.close();
    }
}
