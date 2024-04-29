package stack;

import java.util.Stack;

public class PushAtBtmStack {

    // reccursion 
public static void pushAtBottom(Stack<Integer> s ,int n ){
    if(s.isEmpty()){
        s.push(n);
        return;
    }
    int top = s.pop();
    pushAtBottom(s, n);
    s.push(top);
} 

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,0);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
