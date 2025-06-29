package VeryImportatnt;

public class RemoveNthNodeFromEnd {

    // Node class definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Method to add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to add a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Fixed method to remove nth node from end
    public void removeNthNodeFromEnd(int n) {
        if (head == null || n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // Calculate size of linked list
        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // If n is greater than size, invalid
        if (n > size) {
            System.out.println("Position is greater than list size");
            return;
        }

        // If we need to remove the first node (nth from end = size)
        if (n == size) {
            head = head.next;
            return;
        }

        // Find the node before the one to be deleted
        int positionFromStart = size - n;
        Node prev = head;

        for (int i = 1; i < positionFromStart; i++) {
            prev = prev.next;
        }

        // Remove the nth node from end
        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd list = new RemoveNthNodeFromEnd();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println("Original List:");
        list.printList();

        // Remove 2nd node from end (which is 4)
        System.out.println("\nAfter removing 2nd node from end:");
        list.removeNthNodeFromEnd(2);
        list.printList();

        // Remove 1st node from end (which is 5)
        System.out.println("\nAfter removing 1st node from end:");
        list.removeNthNodeFromEnd(1);
        list.printList();

        // Remove 3rd node from end (which is 1, the first node)
        System.out.println("\nAfter removing 3rd node from end:");
        list.removeNthNodeFromEnd(3);
        list.printList();
    }
}
