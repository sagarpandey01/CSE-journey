import java.util.*;

public class HappyNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while(n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        if(n == 1) {
            System.out.println("Happy Number");
        }
        else {
            System.out.println("Not a Happy Number");
        }
        sc.close();
    }
}