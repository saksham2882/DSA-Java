package Alpha_19_Binary_Tree;

public class CWH_11_Kth_Ancestor_of_Node {
    
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

    public static int kth_Ancestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = kth_Ancestor(root.left, n, k);
        int rightDist = kth_Ancestor(root.right, n, k);

        if (leftDist == -1 && rightDist == 1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);     // Here, we check the distance from both sides to determine where the node (n) exists (if the value is positive). // Valid distance.
        
        if (max + 1 == k) {
            System.out.println(k + "th Ancestor of Node " + n + " is: " + root.data);
        }

        return max + 1;
    }
    
    public static void main(String[] args) {
        
        /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println();

        int n = 4, k = 2;

        kth_Ancestor(root, n, k);
        // System.out.println(kth_Ancestor(root, n, k));

    }
}
