package stack;

import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> s, int n) {
        if (s.isEmpty()) {
            s.push(n);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, n);
        s.push(top);
    }

    public static void reverser(Stack<Integer> st) {
        if (st.isEmpty()) {

            return;
        }
        int top = st.pop();
        reverser(st);
        pushAtBottom(st, top);
    }

    public static void print(Stack<Integer> st) {
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        reverser(st);
        print(st);
    }
}
