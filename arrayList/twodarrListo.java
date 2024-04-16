package arrayList;

import java.util.ArrayList;

/**
 * 2darrListo
 */
public class twodarrListo {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> grceryList = new ArrayList<>();

        ArrayList<String> backeryList = new ArrayList<String>();

        backeryList.add("Bread");
        backeryList.add("Pasta");
        backeryList.add("Donuts");
        backeryList.add("GarlicBread");

        ArrayList<String> productList = new ArrayList<String>();

        productList.add("Tomato");
        productList.add("Salsa");
        productList.add("Wheat");
        productList.add("Peppers");

        ArrayList<String> drinkList = new ArrayList<String>();

        drinkList.add("RedBull");
        drinkList.add("Cola");

        grceryList.add(backeryList);
        grceryList.add(productList);
        grceryList.add(drinkList);

        System.out.println(grceryList.get(1).get(1));
    }

}