import java.util.*;
public class CountPositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the Elements of Arrays");
           arr[i] = sc.nextInt();
        }
        int positive=0;
        int negative=0;
        int zeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                positive++;

            }
            else if(arr[i]<0){
                negative++;
            }
            else if(arr[i]==0){
                zeroes++;

            }

        }
        System.out.println("number of positive element = " + positive);
        System.out.println("number of negative element = " + negative);
        System.out.println("number of zeroes = " + zeroes);
        sc.close();

    }
    
}
