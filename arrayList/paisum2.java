package arrayList;

import java.util.ArrayList;

public class paisum2 {
    public static boolean numOfPairs3(ArrayList<Integer> arr, int target) {
        int bp = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1, rp = bp;
        int n = arr.size() ;
        while (lp != rp) {
            if (arr.get(lp) + arr.get(rp) == target) {
                return true;
            }
            if (arr.get(lp) + arr.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(numOfPairs3(arr, 4));
    }
}
