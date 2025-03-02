package Alpha_19_Binary_Tree;

public class CWH_6_Subtree_of_another_tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Return true if "subtree" (2nd tree) is identically same as the "subtree of main tree" (1st tree or big tree)

    // Step 1: find subRoot in (big) tree: using traversal method
    public static boolean findSubNode(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return findSubNode(root.left, subRoot) || findSubNode(root.right, subRoot);
    }

    // Step 2: check identical tree and subtree OR NOT:
    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } 
        else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }

        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        
        /*  Tree: (Main tree)
                     1
                   /   \
                  2     3
                 / \   / \
                4   5 6   7
        */
        

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*  Subtree: 
                    2
                   / \
                  4   5
         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        System.out.println("subtree of another tree: " + findSubNode(root, subRoot));
    }
}
