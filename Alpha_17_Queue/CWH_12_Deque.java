package Alpha_17_Queue;

import java.util.*;

public class CWH_12_Deque {
    public static void main(String[] args) {
        // Deque => (Double Ended Queue) Similar to Doubly Linked List.
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);

        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());
    }
}
