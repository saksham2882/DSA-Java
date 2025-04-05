package Alpha_14_Linked_List;

public class CWH_07_Remove_a_Cycle_in_a_LL extends CWH_06_Detect_a_Cycle_in_a_LL {

    // T.C :  O(n)
    public static void removeCycle() {
        // Detect Cycle :
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                isCycle = true;     // cycle detect
                break;
            }
        }
        if (isCycle == false) {
            return; 
        }

        // Find Meeting Point :
        slow = head;
        Node prev = null;           // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle ->  last.next = null :
        prev.next = null;
    }
    public static void main(String[] args) {
        
        // Removing Cycle from the Linked List.
        // Step 1: Find Last Node
        // Step 2: last node -> next = null;

        // Here again slow and fast pointer approach help to solve this question.
        // In previous question we see that how the both pointer meet again after the initial (in cycle).

        // Now when both pointer meet, set "Slow" = head again.
        // And again start traversing both by increasing "slow = slow + 1" amd also "fast = fast + 1" , repeat that process until they meet again, And that meet is "The point of Intersection" which create cycle in the Linked list.

        // so Now one node just previous the intersection node ("Say it prev node, also know as last node.").
        // set this prev ka next = null. And we remove the cycle from the LL.


        // We assume that the complete cycle not Created. (means "head is not the again meeting Point (point of intersection)". In questions they asked for anyPoint (except the head)).

        CWH_07_Remove_a_Cycle_in_a_LL rc = new CWH_07_Remove_a_Cycle_in_a_LL();

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1-> 2-> 3-> 2

        // rc.display();                  // Don't run it because It print a infinite LL (because of cycle)

        if (rc.isCycle()) {
            System.out.println("Cycle Exists in LL.");
        } else {
            System.out.println("Cycle does not Exists in LL.");
        }

        removeCycle();

        if (rc.isCycle()) {
            System.out.println("Cycle Exists in LL.");
        } else {
            System.out.println("Cycle does not Exists in LL.");
        }

        rc.display();
    }
} 
