import java.util.*;
public class MinElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] var = new int[size];
        for(int i=0;i<size;i++){
            var[i]=sc.nextInt();

        }
        int min=var[0];
        for(int i=0;i<size;i++){
            if(var[i]<min){
                min=var[i];

            }

        }
        System.out.println(min);
    }
    
}
