package Alpha_14_Linked_List;

class Reverse extends CWH_01_Linked_List_Implementation {

    // Reverse (Iteratively approach) : O(n)  
    // three variable and four steps.
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}

public class CWH_03_Reverse_a_LL {
    public static void main(String[] args) {
        
        Reverse r = new Reverse();
        r.addLast(1);
        r.addLast(2);
        r.addLast(3);
        r.addLast(4);
        r.display();

        r.reverse();
        r.display();
    }
}
 