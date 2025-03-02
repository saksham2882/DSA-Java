package Alpha_14_Linked_List;

class Detect_Cycle extends CWH_1_Linked_List_Implementation {
    
    // T.C : O(n)
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;             // cycle exists
            }
        }
        return false;                    // cycle doesn't exists.
    }
}

public class CWH_6_Detect_a_Cycle_in_a_LL extends Detect_Cycle{
    public static void main(String[] args) {
        
        // This problem solved by Floyd's Cycle Finding Algorithm.
        // To detect a loop/cycle in a Linked List : we use two pointer approach (slow and fast approach).
        
        // we increase a Slow pointer by "1" and fast By "2". Initially both at the same position, as they move, the distance b/w them also increase. And the distance is depend on no.of moves. For example : If we move both 2 times then the distance b/w them is also 2.
        // After some time (In cycle) they meat at the distance "d". (Means the distance b/w slow and fast is d.)
        // If we see from one side the distance b/w them is "0" and from other side is "d".

        // With the help of this we detect the cycle in Linked List or not.
        // If a cycle is present in the LL then There exists one node where both pointers meet after Initial. because this after meeting is not possible in linear LL. 

        Detect_Cycle dc = new Detect_Cycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // 1 -> 2 -> 3 -> 1

        if (dc.isCycle()) {
            System.out.println("Cycle Exists in LL.");
        } else {
            System.out.println("Cycle does not Exists in LL.");
        }
    }
}
