package hashmap;

import java.util.HashMap;

public class DupeString {

    public static void main(String[] args) {
        String str = "ankjhgfha";
        String h = getPureString(str);
        System.out.println(h);
    }

    public static String getPureString(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                int temp = hm.get(str.charAt(i));
                hm.put(str.charAt(i), temp + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < str.length(); j++) {
            if (hm.get(str.charAt(j)) == 1) {
                sb.append(str.charAt(j));
            }
        }

        return sb.toString();
    }

}
