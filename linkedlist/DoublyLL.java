package linkedlist;

/**
 * DoublyLL
 */
public class DoublyLL {
    public class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 1;

    // add

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;

    }

    // remove

    public int removeFirst() {
        if (head == null) {
            System.out.println("null");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int data = head.data;
            head = tail =  null;
            size--;
            return data;

        }
        int data = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return data;

    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        print();
        System.out.println(dll.size);
        dll.removeFirst();
        print();
        System.out.println(dll.size);
       
    }
}