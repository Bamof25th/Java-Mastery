package queues;


public class QueueLL<T> {
    static class Node <T>{
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;  
        }
    }

    class QueueC {
        Node<T> head = null;
        Node<T> tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public T remove() {
            if (isEmpty()) {
                System.out.println(" queue is empty");
                return null;
            }
            T front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public T peek() {
            if (isEmpty()) {
                System.out.println(" queue is empty");
                return null;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        QueueLL<Integer> queueLL = new QueueLL<>();
        QueueLL<Integer>.QueueC q = queueLL.new QueueC();
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
