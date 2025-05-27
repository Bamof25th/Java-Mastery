package queues;

public class GenericQueue<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size;

    static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public GenericQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public boolean isEmpty(){
      return this.size ==0;
    }

    public void add(T data){
      Node<T> newNode = new Node<>(data);
      if(isEmpty()){
        head = newNode;
      }else{
        tail.next = newNode;
      }
      this.size++;
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
        }
        // Node<T> peekNode = head;
        // head = head.next;
        return head.data;
    }
    
    public T remove(){
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
        }
        Node<T> peekNode = head;
        head = head.next;
        return peekNode.data;
    }
    // List<T> ll = new LinkedList<>();

}