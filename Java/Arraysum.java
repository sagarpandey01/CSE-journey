import java.util.*;
public class Arraysum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] var = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements of arrys");
            var[i] = sc.nextInt();

        }
        for(int i=0; i<size;i++){
            sum = sum + var[i];
        }
        System.out.println("The sum of arrays elements is  " + sum);

    }
}