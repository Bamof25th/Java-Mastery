package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class solv {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        int[] query = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int j = 0; j < m; j++) {
            query[j] = scn.nextInt();
        }

        ferquency(arr, query);
        scn.close();
    }

    // static void ferquency(int[] arr, int[] query) {
    // int m = query.length;
    // int n = arr.length;
    // for (int i = 0; i < m; i++) {
    // int val = query[i];
    // int count = 0;
    // for (int j = 0; j < n; j++) {
    // if (arr[j] == val) {
    // count++;
    // }
    // }
    // System.out.println(count);
    // }

    // }
    // * with hashMap
    static void ferquency(int[] arr, int[] query) {
        int m = query.length;
        int n = arr.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (int j = 0; j < m; j++) {
            int val = query[j];
            if (hm.containsKey(val) == true) {
                System.out.println(hm.get(val));
            } else {
                System.out.println(0);
            }
        }
    }
}
