package Alpha_19_Binary_Tree;

import java.util.ArrayList;

public class CWH_09_Lowest_Common_Ancestor {

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


    // O(n)
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);
        
        if (root.data == n) {
            return true;
        }

        boolean foundAtLeft = getPath(root.left, n, path);
        boolean foundAtRight = getPath(root.right, n, path);

        if (foundAtLeft || foundAtRight) {
            return true;
        }

        path.remove(path.size() - 1);        // removing last element if not exists.
        return false;
    }


    // Time and Space complexity: O(n)
    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // Step 1: get path Root to Node
        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // last common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        // last equal(common) node -> (i-1)  place
        Node lca = path1.get(i - 1);
        return lca;
    }


    // LCA without Extra Space (neglect recursion stack space)
    public static Node lCA_without_Space(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lCA_without_Space(root.left, n1, n2);
        Node rightLca = lCA_without_Space(root.right, n1, n2);

        // leftLca = value, rightLca = null
        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }

        return root;
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

        int n1 = 4, n2 = 5;

        System.out.println("Lowest common Ancestor of " + n1 + " and " + n2 + " is: " + lca(root, n1, n2).data);

        System.out.println("Lowest common Ancestor of " + n1 + " and " + n2 + " is (without extra space) : " + lCA_without_Space(root, n1, n2).data);

    }
}