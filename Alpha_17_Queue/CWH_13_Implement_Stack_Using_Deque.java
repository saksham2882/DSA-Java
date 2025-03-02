package Alpha_17_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class CWH_13_Implement_Stack_Using_Deque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // Push : O(1)
        public void push(int data) {
            deque.addLast(data);
        }

        // Pop : O(1)
        public int pop() {
            return deque.removeLast();
        }

        // Peek : O(1)
        public int peek() {
            return deque.getLast();
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();     // This is not a (JCF) stack; it's a custom stack implemented as a class above
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Peek: " + s.peek());
        System.out.println("Pop: " + s.pop());
        System.out.println("Pop: " + s.pop());
        System.out.println("Peek: " + s.peek());
    }
}
