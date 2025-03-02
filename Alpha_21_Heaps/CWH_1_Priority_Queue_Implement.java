package Alpha_21_Heaps;

import java.util.PriorityQueue;

public class CWH_1_Priority_Queue_Implement {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding O(log n)
        pq.add(3);  
        pq.add(4);
        pq.add(1);
        pq.add(6);
        pq.add(5);

        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());    // O(1)
            pq.remove();                      // O(log n)
            System.out.println(pq);
        }
    }
}