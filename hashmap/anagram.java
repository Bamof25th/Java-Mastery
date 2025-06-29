package hashmap;

import java.util.HashMap;

public class anagram {
    public static boolean isAnagram(String str1, String str2) {
        // Your code goes here
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        while (i < str1.length()) {
            hm.put(str1.charAt(i), 1);
        }
        return false;

    }

    public static void main(String[] args) {
        String n = "triangle";
        String s = "integral";

        System.out.println(isAnagram(s, n));
    }
}
