package queues;

public class Fifo {
    static class Queues {
        static int arr[];
        static int size;
        static int rear;

        Queues(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public  boolean isEmpty() {
            return rear == -1;
        }

        public  void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public  int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");

                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear =rear-1;
            return front;
        }

        public  int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");

                return -1;
            }
            int front = arr[0];
            return front;
        }

    }
    public static void main(String[] args) {
        Queues q = new Queues(5);
        q.add(5);
        q.add(2);
        q.add(4);
        q.add(1);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " " );
            q.remove();
        }
    }
}
