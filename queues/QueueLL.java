package queues;


public class QueueLL<T> {
    static class Node <T>{
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;  
        }
    }

    static class QueueC {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static T remove() {
            if (isEmpty()) {
                System.out.println(" queue is empty");
                return -1;
            }
            T front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println(" queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        QueueC q =  new QueueC();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek() + " ");
            q.remove();
        }
    }
}
