import java.util.*;

public class CountDistinctElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }

        System.out.println("Distinct Elements = " + set.size());

        sc.close();
    }
}