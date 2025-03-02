package Alpha_21_Heaps;

import java.util.PriorityQueue;

public class CWH_5_Nearby_cars {

    static class Point implements Comparable<Point> {
        int x, y, distSq, index;

        public Point(int x, int y, int distSq, int index) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.index = index;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;    // sort in ascending order  
        }
    }
    
    public static void main(String[] args) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int len = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        // nearest k cars:
        for (int i = 0; i < len; i++) {
            System.out.println("C" + pq.remove().index);
        }
    }
}
