package Alpha_17_Queue;

import java.util.Stack;

public class CWH_06_Queue_Using_Two_Stack_Case_2 {

    // Case [2] : Add => O(1)  & Remove => O(n)
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty()  && s2.isEmpty();
        }

        // Add : O(1)
        public void add(int data) {
            s1.push(data);
        }

        // Remove : O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            // Transfer elements to s2 only if s2 is empty
            if (s2.isEmpty()) {
                while (!s1.empty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }

        // Peek : O(n)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            // Transfer elements to s2 only if s2 is empty
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
    }
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        System.out.println("Peek: " + q.peek());
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());

        q.add(5);
        System.out.println("Peek: " + q.peek()); 

        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.remove());
        }
    }
}
