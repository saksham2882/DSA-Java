package Alpha_20_BST;

public class CWH_07_Mirror_a_BST extends CWH_01_Build_a_BST {
    
    // T.C : O(n)
    public static Node mirrorBST(Node root) {    
        if (root == null) {
            return null;
        }

        Node leftSubTreeMirror = mirrorBST(root.left);
        Node rightSubTreeMirror = mirrorBST(root.right);

        root.left = rightSubTreeMirror;
        root.right = leftSubTreeMirror;

        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        mirrorBST(root); 
        inOrder(root);        // The InOrder traversal of a Mirror Tree is sorted in decreasing order.

    }
}