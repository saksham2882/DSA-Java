package Alpha_20_BST;

public class CWH_06_Validate_BST extends CWH_01_Build_a_BST {
    
    // T.C :  O(n)
    public static boolean isValidBST(Node root, Node min, Node max) {    
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }
        else if (max != null && root.data >= max.data) {
            return false;
        }

        boolean leftCheck = isValidBST(root.left, min, root);
        boolean rightCheck = isValidBST(root.right, root, max);

        return leftCheck && rightCheck;
    }

    public static void main(String[] args) {
        // int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        int values[] = { 8, 8, 8, 8 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if (isValidBST(root, null, null)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Not a Valid BST");
        }
    }
}