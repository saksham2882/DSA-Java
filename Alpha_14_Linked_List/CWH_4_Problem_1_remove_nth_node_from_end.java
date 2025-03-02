package Alpha_14_Linked_List;

class RemoveNth extends CWH_1_Linked_List_Implementation {
    public void deleteNthFromEnd(int n) {
        // calculate size :
        int size1 = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size1++;
        }
    
        if (n == size1) {
            head = head.next;   // remove First
            return;
        }
        
        // traverse to size - n (prev node)
        int index = 1;
        int indexToFind = size1 - n;
        Node prev = head;
        while (index < indexToFind) {
            prev = prev.next;
            index++;
        }
        prev.next = prev.next.next;
        return;
    }
}

public class CWH_4_Problem_1_remove_nth_node_from_end {
    public static void main(String[] args) {

        // find and remove nth node from End (Iterative Approach) : O(n)

        RemoveNth rn = new RemoveNth();
        rn.addLast(1);
        rn.addLast(4);
        rn.addLast(5);
        rn.addLast(9);
        rn.addLast(7);
        rn.display();

        rn.deleteNthFromEnd(2);
        rn.display();
    }
}
