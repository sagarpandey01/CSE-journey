import java.util.Scanner;

public class SmallestSubarrayWithSum {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter K:");
        int k=sc.nextInt();
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum>=k){
                    minlen=Math.min(minlen,j-i+1);               
                    break;
            }
        }
    }
    if(minlen==Integer.MAX_VALUE){
        System.out.print(0);
    }
    else{
        System.out.print("minimum length: " + minlen);
    }
    sc.close();
    }
}
