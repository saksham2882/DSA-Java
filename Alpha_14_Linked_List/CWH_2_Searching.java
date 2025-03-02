package Alpha_14_Linked_List;

class Search extends CWH_1_Linked_List_Implementation {
    
    // Searching (Iteratively):   O(n)
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Searching (Recursively) : also use concept of back tracing for correct index return.
    // here recursively we change the head = head->next until we found the element then stop when find. Now at that head index seems like "0" so now back tracing to the original head (index) to get the correct index.

    // both time and space complexity : O(n)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }
}

public class CWH_2_Searching {
    public static void main(String[] args) {
        
        // Searching (Iterative) :
        // Search for a key in a linked list. return the position where it is found. if not found, return -1.
        Search s = new Search();
        s.addFirst(2);
        s.addFirst(4);
        s.addFirst(9);
        s.addFirst(3);
        s.display();

        // int a = s.itrSearch(4);
        int a = s.recSearch(2);
        if (a != -1) {
            System.out.println("Element found at index : " + a);
        } else {
            System.out.println("Element not Found");
        }

        System.out.println(s.recSearch(10));
    }
}
