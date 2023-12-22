import java.util.ArrayList;

class QueueArray
{
    static class queue
    {

        static ArrayList<Integer> list = new ArrayList<>();

        public static void enqueue(int data)
        {
            list.add(data);
        }

        public static int dequeue()
        {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return list.remove(0);
        }

        public static boolean isEmpty()
        {
            return list.isEmpty();
        }

        public static int front()
        {
            return list.get(0);
        }
    }
    public static void main(String[] args)
    {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.front());

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue() + " dequeued from queue");
    }
}
// class QueueArray
// {
//     static class Queue
//     {
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n)
//         {
//             arr = new int[n];
//             size = n;
//             rear = -1;

//         }

//         boolean isEmpty()
//         {
//             return rear == -1;
//         }

//         void enqueue(int data)
//         {
//             if (rear == size - 1)
//             {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             rear = rear + 1;
//             arr[rear] = data;

//         }

//         int dequeue()
//         {
//             if (isEmpty())
//             {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int front = arr[0];
//             for (int i = 0; i < rear; i++)
//                 arr[i] = arr[i + 1];
//             rear = rear - 1;
//             return front;
//         }

//         int peek()
//         {
//             if (isEmpty())
//             {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[0];

//         }
//     }

//     public static void main(String[] args)
//     {
//         Queue q = new Queue(5);
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         q.enqueue(4);
//         q.enqueue(5);

//         while (!q.isEmpty())
//         {
//             System.out.println(q.peek());
//             q.dequeue();
//         }

//     }
// }
