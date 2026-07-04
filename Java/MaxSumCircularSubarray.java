import java.util.Scanner;

public class MaxSumCircularSubarray {

    public static int kadaneMax(int[] arr) {
        int currMax = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);
        }

        return maxSum;
    }

    public static int kadaneMin(int[] arr) {
        int currMin = arr[0];
        int minSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);
        }

        return minSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements");
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int maxSum = kadaneMax(arr);

        if (maxSum < 0) {
            System.out.println(maxSum);
            return;
        }

        int minSum = kadaneMin(arr);

        int circularSum = totalSum - minSum;

        System.out.println(Math.max(maxSum, circularSum));
    }
}
