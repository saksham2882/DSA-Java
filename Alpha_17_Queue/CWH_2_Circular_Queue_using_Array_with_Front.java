package Alpha_17_Queue;

public class CWH_2_Circular_Queue_using_Array_with_Front {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty:
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // isFull
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add: O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full.");
                return;
            }
            // Add 1st Element:
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove: (using rear) O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }

            int value = arr[front];

            // Last Element Delete:
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return value;
        }

        // Peek: O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(8);

        System.out.println(q.remove());
        q.add(9);
        System.out.println(q.remove());
        q.add(10);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
