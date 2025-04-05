package Alpha_20_BST;

public class CWH_02_Search_in_a_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean searchInBST(Node root, int key) {  //O(H)
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }
        else if (root.data > key) {
            return searchInBST(root.left, key);
        }
        else {
            return searchInBST(root.right, key);
        }

    }
    
    public static void main(String[] args) {
        /*
                        8
                       / \
                      5   10
                     / \    \
                    3   6    11
                   / \         \
                  1   4        14
        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        System.out.println();

        int key = 11;

        if (searchInBST(root, key)) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key not found");
        }
    }
}
 