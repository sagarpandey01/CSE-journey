import java.util.Scanner;

public class LongestConseSeq {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxlen=0;
        for(int i=0;i<n;i++){
            int count=1;
            int current=arr[i];
            while(search(arr,current+1)){
                current++;
                count++;
            }
            maxlen=Math.max(maxlen,count);
        }
        System.out.print("maximum length: " + maxlen);
        sc.close();
    }
        static boolean search(int[] arr,int target){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return true;
                }
            }
            return false;
        }
    }

