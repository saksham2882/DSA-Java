package Alpha_14_Linked_List;

public class CWH_1_Linked_List_Implementation {

    public static class Node {
        public int data;
        public Node next;

        // Initializing Node:
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    // public static int size;     // Make size static so that any increment in node size updates the global size as well.
    public int size;
  

    // 1. Add Node at the first place :  O(1)
    public void addFirst(int data) {
        // step1 : create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 : newNode next = head
        newNode.next = head;
        // step3 : head = newNode
        head = newNode;
    }


    // 2. Add Node at the last :  O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    // 3. Add in the middle : O(n)
    public void addAtIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return; 
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        } 
        
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // 4. Printing Linked List : O(n)
    public void display() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }


    // 5. Remove First Element(head) : O(1)
    public int removeFirst() {
        // NOTE : Garbage Collector automatically delete the space occupied by the that node.
        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        }
        else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    } 


    // 6. Remove Last : O(n)
    public int removeLast() {
        // NOTE : Garbage Collector automatically delete the space occupied by the that node.
        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        // prev : i = size -2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int value = prev.next.data;  // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    public static void main(String[] args) {

        // In Java, the next in a node stores a reference variable, which points to the next node's object.
        // To create a linked list, we need a Node class, and each node is an object of this class.


        // NOTE : A node's next always points to the original address of the next node, even if the next node's variable changes.

        CWH_1_Linked_List_Implementation ll = new CWH_1_Linked_List_Implementation();
        
        ll.display();
        ll.addFirst(2);          // O(1)
        ll.display();
        ll.addFirst(1);          // head -> 1 -> 2 
        ll.display();
        ll.addLast(3);           // O(1)
        ll.display();
        ll.addLast(4);
        ll.display();
        ll.addAtIndex(2, 9);
        ll.display();
        System.out.println("The size of LL : " + ll.size);
        System.out.println(ll.removeFirst());
        ll.display();
        System.out.println("The size of LL : " + ll.size);

        System.out.println(ll.removeLast());
        ll.display();
        System.out.println("The size of LL : " + ll.size);

    }
} 