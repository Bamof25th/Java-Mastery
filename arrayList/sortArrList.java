package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrList {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(5);
        lists.add(0);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(1);

        System.out.println(lists);

        Collections.sort(lists); // asending order

        System.out.println(lists);

        Collections.sort(lists, Collections.reverseOrder()); // desending order
        System.out.println(lists);
        // op
        // [5, 0, 2, 3, 4, 1]
        // [0, 1, 2, 3, 4, 5]
        // [5, 4, 3, 2, 1, 0]
    }
}
