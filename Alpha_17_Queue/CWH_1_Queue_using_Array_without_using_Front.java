package Alpha_17_Queue;

public class CWH_1_Queue_using_Array_without_using_Front {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty: 
        public boolean isEmpty() {
            return rear == -1;
        }

        // Add: O(1)
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full.");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // Remove: (using rear) O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }

            int value = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return value;
        }

        // Peek:
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(8);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}