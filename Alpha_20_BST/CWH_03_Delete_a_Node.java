package Alpha_20_BST;

public class CWH_03_Delete_a_Node extends CWH_01_Build_a_BST{
    
    public static Node delete(Node root, int value) {

        if (root.data < value) {
            root.right = delete(root.right, value);
        } 
        else if (root.data > value) {
            root.left = delete(root.left, value);
        } 
        else { // root.data == value

            // case 1:- leaf node 
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2:- single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3:- two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;
    }
    
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
    
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        root = delete(root, 3);
        System.out.println();

        inOrder(root);

    }
}
