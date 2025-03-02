package Alpha_21_Heaps;

import java.util.PriorityQueue;

public class CWH_8_Sliding_Window_Maximum {

    static class Pair implements Comparable<Pair> {
        int value;
        int index;

        public Pair(int value, int index) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Pair p2) {
            // for Ascending : (min value in front)
            // return this.val - p2.val;

            // For descending:
            return p2.value - this.value;
        }
    }

    public static void main(String[] args) {                // O(n log k)
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;                                          // window size
        int result[] = new int[arr.length - k + 1];         // (n-k+1) 


        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window:
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        result[0] = pq.peek().value;                         // 1st answer   


        // For other windows:
        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().index <= (i - k)) {
                pq.remove();                                 // remove those element from PQ which ar not a part of current window
            }

            pq.add(new Pair(arr[i], i));
            result[i - k + 1] = pq.peek().value;
        }
        
        
        // Print result:
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}