import java.util.*;
public class LongConseSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i]-1)){
                int count=1;
                int next=arr[i]+1;
                while(set.contains(next)){
                    count++;
                    next++;
                }
                ans=Math.max(ans,count);
            }
        } 
        System.out.println("Longest consecutive Sequence length: " + ans);
        sc.close();
    }
}
