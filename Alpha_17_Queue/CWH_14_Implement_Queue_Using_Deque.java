package Alpha_17_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class CWH_14_Implement_Queue_Using_Deque {

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // add: O(1)
        public void add(int data) {
            deque.addLast(data);
        }

        // remove : O(1)
        public int remove() {
            return deque.removeFirst();
        }

        // peek : O(1)
        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek : " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println("Peek : " + q.peek());
    }
}