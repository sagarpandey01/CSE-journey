import java.util.*;

public class IntersectionUsingHashset {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter the element of Array1");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array2: ");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Enter the element of Array2");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        HashSet<Integer> result = new HashSet<>();
        for(int i=0;i<n2;i++){
            if(set.contains(arr2[i])){
                result.add(arr2[i]);
            }
        }
        System.out.println("Intersection: " + result);
        sc.close();
    }
}
