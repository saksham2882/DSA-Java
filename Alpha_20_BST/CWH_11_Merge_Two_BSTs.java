package Alpha_20_BST;
import java.util.*;

public class CWH_11_Merge_Two_BSTs {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInOrder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        getInOrder(root.left, arr);
        arr.add(root.data);
        getInOrder(root.right, arr);

    }

    public static Node sortedToBalBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        Node root = new Node(arr.get(mid));
        root.left = sortedToBalBST(arr, start, mid - 1);
        root.right = sortedToBalBST(arr, mid + 1, end);

        return root;
    }


    // T.C : O(n+m)
    public static Node mergeBSTs(Node root1, Node root2) {    
        // Step 1: InOrder Sequence
        ArrayList<Integer> arr = new ArrayList<>();
        getInOrder(root1, arr);
        getInOrder(root2, arr);

        // Step 2:  // here also use merge sort code
        Collections.sort(arr);

        // Step 3: Sorted Array to Balanced BST
        return sortedToBalBST(arr, 0, arr.size() - 1);
    }

    public static void main(String[] args) {
        /* BST 1
                    2
                   / \
                  1   4
        */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /* BST 2
                    9
                   / \
                  3   12
         */

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);


        /* Excepted BST:
                    3
                   /  \
                  1    9
                   \   / \
                    2 4   12
        */

        Node root = mergeBSTs(root1, root2);
        preOrder(root);
    }
}
