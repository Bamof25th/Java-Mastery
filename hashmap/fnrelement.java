package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class fnrelement {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int m = scn.nextInt();
        int[] arr = new int[n];
        // int[] query = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = firstNonRepeating(arr, n);
        System.out.println(ans);
        scn.close();
    }

    static int firstNonRepeating(int arr[], int n) {
        // Complete the function

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }
}
