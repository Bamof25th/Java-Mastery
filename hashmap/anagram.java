package hashmap;

import java.util.HashMap;

public class anagram {
    public static boolean isAnagram(String str1, String str2) {
        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count characters in first string
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Decrement count for characters in second string
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (!charCount.containsKey(ch)) {
                return false; // Character not found in first string
            }
            charCount.put(ch, charCount.get(ch) - 1);
            if (charCount.get(ch) == 0) {
                charCount.remove(ch); // Remove character when count becomes 0
            }
        }

        // If map is empty, strings are anagrams
        return charCount.isEmpty();
    }

    public static void main(String[] args) {
        String n = "triangle";
        String s = "integral";

        System.out.println(isAnagram(s, n));
    }
}
