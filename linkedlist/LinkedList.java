package linkedlist;

public class LinkedList {

    /**
     * Innerll
     */
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;

        public void  addFirst(int data) {

            // step 1 = create new node
            Node newNode = new Node(data);

            // exception if ll is empty
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // step2 = newNode next = head
            newNode.next = head;
            // step3 = head = newnode
            head = newNode;
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            // *main function code
            // ll.head = new Node(1);
            // ll.head.next = new Node(2);
            ll.addFirst(1);
            ll.addFirst(2);
        }
    }
}
