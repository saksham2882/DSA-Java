package Alpha_15_Linked_List_Collections_Framework;

public class CWH_4_Doubly_Linked_list {

    public class Node {
        int data;
        Node next;
        Node prev;

        // Constructor:
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst : O(1)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // addLast : O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // removeFirst : O(1)
    public int removeFirst() {
        // Case 1: Zero Node 
        if (head == null) {
            System.out.println("Doubly LL is Empty");
            return Integer.MIN_VALUE;
        }

        // Case 2: One Node
        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }

        // case 3: For more than one Node
        int value = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    // remove Last : O(1)
    public int removeLast() {
        // Case 1: Zero Node
        if (head == null) {
            System.out.println("Doubly LL is Empty");
            return Integer.MIN_VALUE;
        }

        // Case 2: One Node
        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }

        // case 3: For more than one Node
        int value = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }
    
    // Forward Print : O(n)
    public void forwardPrint() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Backward Print : O(n)
    public void backwardPrint() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Reverse Doubly Linked List: O(n)
    public void reverseDoubly() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next; // extra in Doubly LL
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public static void main(String[] args) {
        CWH_4_Doubly_Linked_list dl = new CWH_4_Doubly_Linked_list();

        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        dl.addFirst(4);
        dl.addLast(5);
        dl.addLast(6);
        
        // Print
        dl.forwardPrint();
        dl.backwardPrint();
        System.out.println("Size of Doubly LL: " + size);
        
        // Remove First
        System.out.println("Removed Element from First: " + dl.removeFirst());
        dl.forwardPrint();
        System.out.println("Size of Doubly LL: " + size);

        // Remove Last
        System.out.println("Removed Element from Last: " + dl.removeLast());
        dl.forwardPrint();
        System.out.println("Size of Doubly LL: " + size);

        // Reverse
        dl.forwardPrint();
        dl.reverseDoubly();
        dl.forwardPrint();
    }
}