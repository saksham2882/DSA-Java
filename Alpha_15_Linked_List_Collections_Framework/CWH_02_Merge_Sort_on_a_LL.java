package Alpha_15_Linked_List_Collections_Framework;

import Alpha_14_Linked_List.CWH_01_Linked_List_Implementation;

public class CWH_02_Merge_Sort_on_a_LL extends CWH_01_Linked_List_Implementation {

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;        // This is for, we want midNode as a first part ka Last Node

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;                  // Mid node
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // T.C : O(n log n)
    public Node mergeSort(Node head) {
        // Base case :
        if (head == null || head.next == null) {
            return head;             // already sorted
        }

        // Find Mid :
        Node mid = getMid(head);

        // MergeSort for left and right LL :
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge :
        return merge(newLeft, newRight);
    }
    

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        
        // Merge Sort on a Linked List: (Similar as the Array merge sort) 
        // Step 1: find mid of the LL. (let suppose mid is the last node of the first half of LL).
        // Step 2: say first half be left and the second half be right.(we break the LL in two part by mid->next = null).
        // Step 3: repeat step two until single node left in the each LL.
        // Step 4: Now Merge the Nodes to Sort. 

        // Use slow-fast pointer to find the mid of the LL. (to get the mid initialize slow = head and fast = head.next to get correct node.)
        // Now rightHead = mid.next and mid.next = null;

        // To perform Merge : we create a temp LL.
        // we create one temp node (called merged with data "-1"). Now compare both LL. If any LL node data is less than the second node data then we point the -1 to that node and so on until one LL is empty. As One LL is Empty then points the LL.
        // In Last to get answer : final head = mergedLL.next (because mergedLL is temp).  

        CWH_02_Merge_Sort_on_a_LL ll = new CWH_02_Merge_Sort_on_a_LL();

        ll.addFirst(3);
        ll.addFirst(6);
        ll.addFirst(8);
        ll.addFirst(5);
        ll.addLast(1);
        ll.addLast(9);
        ll.addLast(2);
        
        ll.display();

        ll.head = ll.mergeSort(ll.head);
        ll.display();
    }
}
