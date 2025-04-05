package Alpha_19_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class CWH_02_Allorder_Traversal extends CWH_01_Build_Tree_Preorder{
    // PreOrder Traversal: O(n)
    public static void preTraverse(Node root) { 
        if (root == null) {
            // System.out.print(-1 + " ");        // -1 represent child -> null
            return;
        }

        System.out.print(root.data + " ");
        preTraverse(root.left);
        preTraverse(root.right);
    }
    
    // InOrder Traversal:  O(n)
    public static void inTraverse(Node root) {
        if (root == null) {
            // System.out.print(-1 + " ");        // -1 represent child -> null
            return;
        }

        inTraverse(root.left);
        System.out.print(root.data + " ");
        inTraverse(root.right);
    }
    
    // PostOrder Traversal:  O(n)
    public static void postTraverse(Node root){ 
        if (root == null) {
            // System.out.print(-1 + " ");        // -1 represent child -> null
            return;
        }

        postTraverse(root.left);
        postTraverse(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order Traversal: O(n)
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);                              // add root (first element to queue)
        q.add(null);                            // null pointer to represent print new line

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();             // new line
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 }; // -1 represent null

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        preTraverse(root);
        System.out.println();

        inTraverse(root);
        System.out.println();

        postTraverse(root);
        System.out.println();

        levelOrder(root);
        System.out.println();

    }
}
