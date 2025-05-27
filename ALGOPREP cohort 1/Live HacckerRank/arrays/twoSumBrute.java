package arrays;
import java.util.Scanner;

/**
 * twoSumBrute
 */
public class twoSumBrute {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        System.out.println(twoSum(arr, k));
    }

    public static boolean twoSum(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }

        }
        return false;
    }
}