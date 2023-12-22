import java.util.ArrayList;

class QueueArray
{
    static class Queue
    {

        static ArrayList<Integer> list = new ArrayList<>();

        public static void enqueue(int data)
        {
            list.add(data);
        }

        public static int dequeue()
        {
            if (isEmpty())
                return -1;
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
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.enqueue(3);

        System.out.println("dequeue:" + Queue.dequeue());
        System.out.println("Front: " + Queue.front());

        Queue.enqueue(4);
        Queue.enqueue(5);

        System.out.println("dequeue:" + Queue.dequeue());
        
        while(!Queue.isEmpty()){
            System.out.println(Queue.front());
            Queue.dequeue();
        }
    }
}