package arrayList;

import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        
        System.out.println(list);

        int elem = list.get(2);
        System.out.println(elem + " is at index 2");

        list.remove(3);
        System.out.println(list);
        
        list.set(2, 10);
        System.out.println(list);
        
        System.out.println(list.contains(10));
    }
}
