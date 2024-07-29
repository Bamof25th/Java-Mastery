package queues;

import java.util.*;

public class NonReapetingFall {
    public static void getNonRea(String str) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++; // 'a'-'a' = 0

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1+" ");
            }else{
                 System.out.print(q.peek() + " ");
            }

        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        getNonRea(str);
    }
}
