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
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i != idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("empty");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // *main function code
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.add(2,99);
        ll.print();
    }
}
