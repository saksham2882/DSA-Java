package Alpha_19_Binary_Tree;

public class CWH_12_Transform_to_sum_Tree {
    
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

    public static int transformSum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transformSum(root.left);
        int rightChild = transformSum(root.right);

        int data = root.data;                                           // store curr root data in variable 

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;        // update curr root.data with original left and right child "node value" and after transformed updated left and right child "node value".

        return data;
    }
    
    
    // For Printing Tree:
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        
        /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        
            Expected sum tree is:
            
                27
               /  \
              9    13
             / \  /  \
            0   0 0   0
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println();

        transformSum(root);
        preOrder(root);

    }
}