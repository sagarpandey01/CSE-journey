import java.util.Scanner;

public class FreqCountOfEachEle {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean already=false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    already = true;
                    break;
                }
            }
            if(already){
                continue;
            }
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println("Frequency of Element " + arr[i] + " is " + count);
        }
        sc.close();
    }    
}
