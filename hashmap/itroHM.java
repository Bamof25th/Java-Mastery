package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class itroHM {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        HashMap<Integer, Integer> hm = new HashMap<>();
        // put
        hm.put(10, 50);
        hm.put(20, 60);
        hm.put(30, 60);
        hm.put(20, 70);
        hm.put(40, 45); // * O(1)

        // get
        int i = hm.get(40);

        // containesKey

        boolean j = hm.containsKey(20); // * O(1)

        // remove

        // hm.remove(10); // * O(1)

        System.out.println(hm);
        System.out.println(i);
        System.out.println(j);

        int[] arr = { 1, 2, 5, 3, 4, 6, 65, 6, 10 };

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        // for (int val2 : hm.get()) {
        // System.out.print(+val2+" ");
        // }
        scn.close();
    }
}
