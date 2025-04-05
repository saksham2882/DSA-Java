package Alpha_20_BST;

public class CWH_08_Sorted_Array_to_Balanced_BST {
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
    
    public static Node createBalBST(int arr[], int start, int end) {      // O(n)
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);

        Node leftSubTree = createBalBST(arr, start, mid - 1);
        Node rightSubTree = createBalBST(arr, mid + 1, end);

        root.left = leftSubTree;
        root.right = rightSubTree;

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        /*  Expected BST
                    8
                   /  \
                  5    11
                 / \   / \
                3   6 10  12
        */

        int start = 0;
        int end = arr.length - 1;

        inOrder(createBalBST(arr, start, end));

    }
}
