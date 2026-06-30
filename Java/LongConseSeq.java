import java.util.Scanner;

public class LongConseSeq {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int current=arr[i];
            int count=1;
            while(true){
                boolean found=false;
                for(int j=0;j<n;j++){
                    if(arr[j]==current+1){
                        found=true;
                        break;
                    }
                }
                if(found){
                    current++;
                    count++;
                }
                else{
                    break;
                }
            }
            if(count>ans){
                ans=count;
            }
        }
        System.out.println("Longest consecutive length is: " + ans);
        sc.close();
    }
}
