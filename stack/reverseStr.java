package stack;

import java.util.Stack;

public class reverseStr {
    public static String revStr(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            st.push(s.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder("");
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "rarwewerra";

        String ans = revStr(s);

        System.out.println(ans);
    }
}
