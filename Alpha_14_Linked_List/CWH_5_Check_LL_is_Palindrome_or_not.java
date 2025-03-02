package Alpha_14_Linked_List;

class LL_Palindrome extends CWH_1_Linked_List_Implementation {

    // Find Middle (slow-fast Approach)
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;            // +1
            fast = fast.next.next;       // +2
        }
        return slow;                     // slow is my midNode.
    }
    
    // Check for Palindrome: O(n)
    public boolean checkPalindrome() {
        // Base case :
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: find mid
        Node midNode = findMid(head);

        // step 2: reverse 2nd half
        Node prev = null;
        Node curr = midNode; 
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next;
        }

        Node right = prev;    // right half head
        Node left = head;

        // step 3: check left half & right half.
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}

public class CWH_5_Check_LL_is_Palindrome_or_not {
    public static void main(String[] args) {
        
        // Method 1. : The most simplest method is to convert this data structure(LL) in a another data structure(Array, ArrayList, String etc). Here both time and space complexity is : O(n).
        // Space complexity is O(n) because we create a new Data Structure. But here we Do it With O(1).

        // Method 2. :
        // 1. slow-fast concept
        // 2. reverse half LL.


        // Steps:
        // 1. find midNode
        // 2. Reverse the 2nd half LL.
        // 3. check if 1stHalf (left)  == 2ndHalf (right).

        // Step 1: we find midNode with the help of slow-fast technique.
        // In slow-fast technique : 
        // slow = head     // increment by 1
        // fast = head     // increment by 2
        // Both start from the Head and move -> slow++ and head+2.Now we have two case for Even Node and Odd Node.
        // For Even No. of Node : we move until fast !=  null. As fast == null, slow is at the 1st position of the 2nd half (middle).
        // For Odd No. of Node : we move until fast.next != null. As fast.next == null, slow at the middle of the LL.

        LL_Palindrome p = new LL_Palindrome();
        p.addLast(1);
        p.addLast(2);
        p.addLast(3);
        p.addLast(2);
        p.addLast(1);
        p.display();

        if (p.checkPalindrome()) {
            System.out.println("LL is Palindrome");
        } else {
            System.out.println("LL is not Palindrome.");
        }
    }
}
