package apnaCollage;

import java.util.ArrayList;

public class index {
    public static void main(String[] args) {

        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int l = arr1.length;
        int k = arr2.length;
        ArrayList<Integer> arr3 = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < arr2.length; i++) {

            num = arr1[i];

            arr3.add(arr2[i] + num);

        }
        for (int i = arr2.length; i < arr1.length; i++) {

            arr3.add(arr2[i]);

        }

        System.out.println(arr3);

    }

}
