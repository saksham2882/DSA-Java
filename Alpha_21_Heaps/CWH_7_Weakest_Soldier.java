package Alpha_21_Heaps;

import java.util.PriorityQueue;

public class CWH_7_Weakest_Soldier {

    static class Row implements Comparable<Row> {
        int soldierCount;
        int index;

        public Row(int soldierCount, int index) {
            this.soldierCount = soldierCount;
            this.index = index;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldierCount == r2.soldierCount) {
                return this.index - r2.index;
            }
            else {
                return this.soldierCount - r2.soldierCount;
            }
        }
    }
    
    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };

        int k = 2;     
        // here k show how many weakest soldier show in answer.

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }

        // by Default priorityQueue sort in ascending order.

        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().index);
        }
    }
}