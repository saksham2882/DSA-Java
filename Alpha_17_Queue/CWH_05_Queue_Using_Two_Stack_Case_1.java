package Alpha_17_Queue;

import java.util.Stack;

public class CWH_05_Queue_Using_Two_Stack_Case_1 {

    // Here we using Case 1.  Add => O(n)  &  remove => O(1)
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Is Empty:
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add : O(n)
        public void add(int data) {
            // Step 1: pop from s1 and push it into s2 until s1 become empty
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Step 2: Add new Element into s1
            s1.push(data);

            // Step 3: rollback the element from s2 and push it into s1 again until s2 become empty
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove : O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        // Peek : O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
