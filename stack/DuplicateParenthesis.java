package stack;

import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean isdupe(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }else{
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }

        return false;                               
    }

    public static void main(String[] args) {
        String st = "((a+b))";
        String st2 = "(a-b)";
        boolean a = isdupe(st);
        boolean b = isdupe(st2);

        System.out.println(a);
        System.out.println(b);
    }
}
