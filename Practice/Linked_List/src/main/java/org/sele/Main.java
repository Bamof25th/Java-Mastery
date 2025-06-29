package org.sele;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList<T>{
    Node<T> head;
    int size;

    CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head =  newNode;
        }else{
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Added: " + data);
        size++;
    }

    void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println("Added first: " + data);
        size++;
    }

    void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Added last: " + data);
        size++;
    }

    void removeFirst(T data){
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }
        T removedData = head.data;
        head = head.next;
        System.out.println("Removed first: " + removedData);
    }

    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node<T> current = head;
        for(int i= 0  ; i < index ; i++){
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    public void printList(){
        Node<T> current = head;
        if(current == null){
            System.out.println("List is empty.");
            return;
        }
        System.out.print("List: ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    CustomLinkedList<Integer> list = new CustomLinkedList<>();

        // Test add
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();

        // Test addFirst
        list.addFirst(5);
        list.printList();

        // Test addLast
        list.addLast(40);
        list.printList();

        // Test get
        System.out.println("Element at index 2: " + list.get(2));

        // Test size
        System.out.println("Size: " + list.size());

        // Test removeFirst
        list.removeFirst(0);
        list.printList();

        // Test removeFirst on empty list
        CustomLinkedList<String> emptyList = new CustomLinkedList<>();
        emptyList.removeFirst("test");
        emptyList.printList();
    }
}