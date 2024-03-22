package arrayList;

import java.util.ArrayList;

public class arrListo {
    public static void main(String[] args) {
        // * ArrayList = a resizable array.
        // elements can be added and removed after compilation phase
        // Store refrence data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("Momos");
        food.add("zinger");
        food.add("Maggie");
        food.add("Ramyun");

        food.set(0, "shushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
