package Alpha_17_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CWH_08_Stack_Using_Two_Queue_Case_2 {

    // Here we perform case [2] : push => O(1)   &   pop => O(n)   
    // Here we don't directly say that In which queue element exists after operation.
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push : O(1)
        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop : O(n)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            // Case 1: If Element in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else { // Case 2: if element in q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            
            return top;
        }
        // Peek : O(n)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            // Case 1: If Element in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else { // Case 2: if element in q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }
    
    public static void main(String[] args) {
        
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
