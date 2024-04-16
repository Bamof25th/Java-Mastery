package arrayList;

import java.util.ArrayList;

public class mdList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Listo = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }


        Listo.add(list1);
        Listo.add(list2);
        Listo.add(list3);

        for (int i = 0; i < Listo.size(); i++) {
            ArrayList<Integer> currList = Listo.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        
        System.out.println(Listo);
    }
}
