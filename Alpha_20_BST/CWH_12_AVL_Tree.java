package Alpha_20_BST;

public class CWH_12_AVL_Tree {

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }
    
    public static Node root;

    // Find Height of Node:
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    // Get Balance Factor of node:
    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    // Left Rotate Subtree rooted with x:
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // return new root;
        return y;
    }

    // Right Rotate subtree rooted with y:
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T3 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T3;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        
        return x;
    }

    // Insert New Node:
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;     // Duplicate Keys not allowed
        }

        // Update root height:
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Get root's Balance Factor (B.F): 
        int bf = getBalance(root);

        // Left - Left Case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // Right - Right Case:
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // Left - Right Case:
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right - Left Case:
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;       // returned if AVL balanced
    }

    // PreOrder traversal:
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*  AVL Tree
                    30
                   /   \
                  20   40
                 /  \    \
                10  25   50
         */

        preOrder(root);
    }
}