package Alpha_17_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CWH_11_Queue_Reversal {

    public static void queueReversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        queueReversal(q);
        System.out.println(q);
    }
}