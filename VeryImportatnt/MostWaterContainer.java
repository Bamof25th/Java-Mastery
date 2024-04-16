package VeryImportatnt;

import java.util.ArrayList;

public class MostWaterContainer {
    // * bruteForce O(n^2) T.C
    public static int maxArea(ArrayList<Integer> arr) {
        int h = 0, w = 0, area = 0, maxArea = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                h = Math.min(arr.get(i), arr.get(j));
                w = j - i;
                area = h * w;
                if (area > maxArea) {
                    maxArea = area;
                }
            }

        }
        return maxArea;
    }

    // * two pointer approach O(n) T.C */
    public static int containerArea(ArrayList<Integer> arr) {
        int maxArea = Integer.MIN_VALUE;
        int h = 0, w = 0;
        int lp = 0, rp = arr.size() - 1;
        int area = 0;
        while (lp < rp) {
            h = Math.min(arr.get(lp), arr.get(rp));
            w = rp - lp;
            area = h * w;

            if (arr.get(lp) < arr.get(rp)) {
                lp++;
            } else {
                rp--;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);

        System.out.println("Maximum Water that can be stored is " + containerArea(arr));
    }
}
