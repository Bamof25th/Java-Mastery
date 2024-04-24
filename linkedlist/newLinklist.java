package linkedlist;
import java.util.LinkedList;

public class newLinklist {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new LinkedList<>();

        //add 
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(2);

        // 2->3->4
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
