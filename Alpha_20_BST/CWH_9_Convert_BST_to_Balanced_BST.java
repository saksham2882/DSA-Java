package Alpha_20_BST;

import java.util.ArrayList;

public class CWH_9_Convert_BST_to_Balanced_BST {
    static class Node {
        int data;
        Node left;
        Node right;

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

    // T.C : O(n)
    public static void getInoder(Node root, ArrayList<Integer> inOrder) {     
        if (root == null) {
            return;
        }
 
        getInoder(root.left, inOrder);
        inOrder.add(root.data);
        getInoder(root.right, inOrder);
    }

     // T.C : O(n)
    public static Node sortedToBalBST(ArrayList<Integer> inOrder, int start, int end) {   
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        Node root = new Node(inOrder.get(mid));
        Node leftSubTree = sortedToBalBST(inOrder, start, mid - 1);
        Node rightSubTree = sortedToBalBST(inOrder, mid + 1, end);

        root.left = leftSubTree;
        root.right = rightSubTree;

        return root;
    }

    // T.C : O(n)
    public static Node balancedBST(Node root) {
        // Step 1: InOrder Sequence
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInoder(root, inOrder);

        // Step 2: Sorted InOrder -> balanced BST
        return sortedToBalBST(inOrder, 0, inOrder.size()-1);
    }

    public static void main(String[] args) {
        /*   Given BST
                        8
                       / \
                      6   10
                     /      \
                    5       11
                   /          \
                  3           12 
        */

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        /* Excepted BST
                        8
                       /  \
                      5    11
                     / \   / \ 
                    3   6 10  12
         */

        preOrder(root);
        System.out.println();

        Node res = balancedBST(root);
        preOrder(res);
    }
}