import java.util.*;

public class HappyNumberBruteForce {

    public static int sumOfSquare(int n){

        int sum = 0;

        while(n > 0){

            int digit = n % 10;

            sum = sum + digit * digit;

            n = n / 10;
        }

        return sum;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int count = 0;

        while(n != 1 && count < 100){

            n = sumOfSquare(n);

            count++;
        }


        if(n == 1){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not a Happy Number");
        }

        sc.close();
    }
}
