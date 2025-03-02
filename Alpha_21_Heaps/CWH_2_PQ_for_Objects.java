package Alpha_21_Heaps;

import java.util.PriorityQueue;

public class CWH_2_PQ_for_Objects {

    static class Student implements Comparable<Student> {     // comparable used for comparing class
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {                    // override comparable compareTo for comparing
            return this.rank - s2.rank;
        }
        
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();
        // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());      // For reverse Order

        // Adding O(log n)
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 2));
        pq.add(new Student("C", 5));
        pq.add(new Student("D", 9));
        pq.add(new Student("E", 7));
        pq.add(new Student("F", 1));

        // System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);    // O(1)
            pq.remove();                      // O(log n)
        }
    }
} 