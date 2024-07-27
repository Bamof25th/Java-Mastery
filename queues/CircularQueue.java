package queues;

public class CircularQueue {

    static class QueueD {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        QueueD(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("is empty");
                return -1;
            }
            int res = arr[front];
            
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        QueueD q = new QueueD(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);


        while (!q.isEmpty()) {
            System.out.println(q.peek() + " " );
            q.remove();
        }
    }
}
