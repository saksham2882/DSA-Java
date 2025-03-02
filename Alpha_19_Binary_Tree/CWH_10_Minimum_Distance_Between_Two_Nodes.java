package Alpha_19_Binary_Tree;

public class CWH_10_Minimum_Distance_Between_Two_Nodes {
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

    // Finding LCA:
    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }

        return root;
    }

    // Finding Distance from LCA to node:
    public static int lcaDist(Node root, int n) {     // Here, the root is simply the "LCA" that was called.
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftLcaDist = lcaDist(root.left, n);
        int rightLcaDist = lcaDist(root.right, n);

        if (leftLcaDist == -1 && rightLcaDist == -1) {
            return -1;
        }
        else if (leftLcaDist == -1) {
            return rightLcaDist + 1;
        }
        else {
            return leftLcaDist + 1; 
        }
    }

    // Minimum Distance Between Two Nodes: O(n)
    public static int minDist(Node root, int n1, int n2) {
        Node Lca = lca(root, n1, n2);

        int dist1 = lcaDist(Lca, n1);
        int dist2 = lcaDist(Lca, n2);

        return dist1 + dist2;
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

        int n1 = 4, n2 = 6;

        System.out.println("Minimum Distance Between " + n1 + " and " + n2 + " is: " + minDist(root, n1, n2));
    }
}
