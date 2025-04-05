package Alpha_19_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class CWH_08_Print_Kth_level_of_tree {

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

    // Approach 1: Recursively PreOrder traversal:  O(n)
    public static void kLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }

    
    // Approach 2: Using Iterative Level order Traversal : O(n)
    public static void KLevel_Iter(Node root, int k) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 1;
                            
        while (!q.isEmpty()) {
            int size = q.size();

            if (level == k) {
                for (int i = 0; i < size; i++) {
                    Node node = q.poll();
                    System.out.print(node.data + " ");
                }
                System.out.println();
                return;
            }

            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            level++;
        }
        
        if (level <= k) {
            System.out.println("Level " + k + " not found in the tree.");
        }
    }

    public static void main(String[] args) {
        /*
                    1 
                   /  \
                  2    3
                 / \  / \
                4  5  6  7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;

        System.out.println("Print Kth Level: ");
        kLevel(root, 1, k);

        System.out.println("\nPrint Kth Level (Iteratively): ");
        KLevel_Iter(root, k);
    }
}