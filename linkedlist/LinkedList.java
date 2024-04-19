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
    public static int size;

    public void addFirst(int data) {

        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i != idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

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

    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(int k, Node head) {
        if (head == null) {
            return -1;
        }

        if (head.data == k) {
            return 0;
        }

        int idx = helper(k, head.next);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recurrSearch(int k) {
        return helper(k, head);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

    }

    public void RemoveNthNodeFromEnd(int n) {
        // calculate size of lonkedlist
        int s = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            s++;
        }
        if (n == s) {
            head = head.next;// remove first
            return ;
        }

        // s-n
        int i = 1;
        int iToFind = s - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return ;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // *main function code
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 99);
        // ll.print();
        System.out.println(ll.recurrSearch(3));
        ll.RemoveNthNodeFromEnd(3);
        // ll.reverse();
        // System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        ll.print();
        // System.out.println(ll.size);
    }
}
