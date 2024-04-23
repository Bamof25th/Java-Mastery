package linkedlist;

public class removeTheLoop{
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        // detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }

        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle --> last.next = null

        prev.next = null;

    }

    public static void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("empty");
        }
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a LinkedList: 1->2->3->4->5
        head = new Node(1);
        Node temp= new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next =  new Node(5);
        removeCycle();
        print();
    }

}
