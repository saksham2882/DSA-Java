package Alpha_20_BST;

import java.util.ArrayList;

public class CWH_05_Root_to_Leaf_path extends CWH_01_Build_a_BST {
    
    // Print Root to Leaf:
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }
    
    // print Path:
    public static void printPath(ArrayList<Integer> path) {
        for (int node : path) {
            System.out.print(node + "-> ");
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // inOrder(root);
        System.out.println();

        ArrayList<Integer> path = new ArrayList<>();
        printRoot2Leaf(root, path);
    }
}