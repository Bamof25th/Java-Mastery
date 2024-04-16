package arrayList;

import java.util.ArrayList;

public class multidimntionalList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> sublist1 = new ArrayList<>();
        sublist1.add(53);
        sublist1.add(82);
        sublist1.add(82);
        sublist1.add(82);
        mainList.add(sublist1);

        ArrayList<Integer> sublist2 = new ArrayList<>();
        sublist2.add(22);
        sublist2.add(32);
        sublist2.add(32);
        sublist2.add(32);
        mainList.add(sublist2);

        ArrayList<Integer> sublist3 = new ArrayList<>();
        sublist2.add(22);
        sublist2.add(32);
        sublist2.add(32);
        sublist2.add(32);
        mainList.add(sublist3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
