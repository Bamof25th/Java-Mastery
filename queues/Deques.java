package queues;

import java.util.*;

/**
 * Deques
 */
public class Deques {

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);  
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}