package arrayList;

import java.util.ArrayList;

public class pairSum {

    // BruteForce
    public static boolean numOfPairs(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {

            for (int j = i; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target) {
                    return true;
                }

            }

        }
        return false;
    }

    // Tow Pointer
    public static boolean numOfPairs2(ArrayList<Integer> arr, int target) {
        int lp = 0, rp = arr.size() - 1;
        int sum = 0;
        while (lp != rp) {
            sum = arr.get(lp) + arr.get(rp);
            // case 1`
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                lp++;
            }
            if (sum > target) {
                rp--;
            }
        }
        return false;
    }
    public static boolean numOfPairs3(ArrayList<Integer> arr, int target) {
        int lp = 0, rp = arr.size() - 1;
        int sum = 0;
        while (lp != rp) {
            sum = arr.get(lp) + arr.get(rp);
            // case 1`
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                lp++;
            }
            if (sum > target) {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(numOfPairs2(arr, 12));

    }
}
