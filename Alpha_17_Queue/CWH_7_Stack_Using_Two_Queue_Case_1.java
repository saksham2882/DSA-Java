package Alpha_17_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CWH_7_Stack_Using_Two_Queue_Case_1 {

    // Here we perform Case [1] : push => O(n)   &   pop => O(1)
    static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty();
        }

        // Push : O(n)
        public void push(int data) {
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    q2.add(q1.remove());
                }
            }

            q1.add(data);

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // Pop : O(1)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return q1.remove();
        }

        // Peek : O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return q1.peek();
        }
    }
    
    public static void main(String[] args) {
        
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
