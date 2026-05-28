import java.util.*;
public class MaxElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] var1 = new int[size];
        for(int i=0;i<size;i++){
            var1[i]=sc.nextInt();

        }
        int max = var1[0];
        for(int i=0;i<size;i++){
            if(var1[i]>max){
                max = var1[i];
            }
            

        }
        System.out.println(max);

    }
    
}
