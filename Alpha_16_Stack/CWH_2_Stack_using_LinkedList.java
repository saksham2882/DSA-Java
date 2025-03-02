package Alpha_16_Stack;

public class CWH_2_Stack_using_LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        // IsEmpty Operation: O(1)
        public static boolean isEmpty() {
            return head == null;
        }

        // Push Operation: O(1)   // Similar as addFirst Operation
        public static void push(int data) {
            Node newNode = new Node(data);
            System.out.println("Push -> " + data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // Pop operation: O(1)    // Similar as removeFirst Operation
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            System.out.println("Popped Element: " + top);
            return top;
        }

        // Peek Operation: O(1)
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        // CWH_2_Stack_using_LinkedList ll = new CWH_2_Stack_using_LinkedList();

        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        
        System.out.println("Top of the Stack Element: " + Stack.peek());

        while (!Stack.isEmpty()) {
            Stack.pop();
        }

        System.out.println("Top of the Stack Element: " + Stack.peek());
    }
}
