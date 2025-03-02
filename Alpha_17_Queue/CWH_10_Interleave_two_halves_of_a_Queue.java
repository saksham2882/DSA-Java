package Alpha_17_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CWH_10_Interleave_two_halves_of_a_Queue {

    // Even length:
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();     // must calculate size and store in variable. Not directly "q.size()" use in for loop because after each remove the size changes.
        
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // It doesn't means that only sorted allow. Any order allow. (But Even length)
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        System.out.println(q);
        interLeave(q);
        System.out.println(q);
    }
}
