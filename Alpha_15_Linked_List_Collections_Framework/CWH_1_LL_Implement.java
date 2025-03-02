package Alpha_15_Linked_List_Collections_Framework;

import java.util.LinkedList;

public class CWH_1_LL_Implement {
    public static void main(String[] args) {
        
        // Create Linked List :
        LinkedList<Integer> ll = new LinkedList<>();

        // Add method :
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);
        ll.addLast(2);
        ll.add(4);
        ll.add(7);
        ll.add(9);
        ll.add(7);
        ll.addLast(1);
        
        // Display :
        System.out.println(ll);

        // Remove :
        ll.remove(2);
        ll.removeFirst();
        ll.removeLast();
        ll.removeFirstOccurrence(7);
        System.out.println(ll);
    }
}
