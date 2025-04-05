package Alpha_15_Linked_List_Collections_Framework;

import Alpha_14_Linked_List.CWH_01_Linked_List_Implementation;

class ZigZag extends CWH_01_Linked_List_Implementation{
    
    public void zigzag() {
        // FInd Mid:
        Node slow = head;
        Node fast = head.next;     // 1st half last node be midNode
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd Half :
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Alternate Merge : Zig-Zag merge
        while (left != null && right != null) {
            
            // For zig-Zag :
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // Update head :
            left = nextL;
            right = nextR;
        }
    }
   
}

public class CWH_03_Zig_Zag_LL {
    public static void main(String[] args) {
        
        // Zig-Zag Linked List :
        // For a LL of the form : L(1) -> L(2) -> L(3) -> ...... L(n-1) -> L(n)
        // Convert it into a zig-zag form i.e: L(1) -> L(n) -> L(2) -> L(n-1) -> L(3) .....

        // Approach : Here we use the similar concept as use in palindrome problem.

        // Step 1: find Mid (mid = first half -> last node)
        // Step 2: Reverse second half LL. (separate both LL and point last node->next = null for both First and second half LL)
        // Step 3: Alternate Merging the LL.

        ZigZag ll = new ZigZag();

        ll.addFirst(3);
        ll.addFirst(6);
        ll.addFirst(8);
        ll.addFirst(5);
        ll.addLast(1);
        ll.addLast(9);
        ll.addLast(2);

        ll.display();
        ll.zigzag();
        ll.display();
    }
}
