public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void enqueue(int data) {
            Node newNode = new Node(data);
            // add 1st elm
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;

        }

        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("QUEUE is empty");
                return -1;
            }
            // single elment
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
