package Alpha_19_Binary_Tree;

public class CWH_5_Diameter_of_a_Tree {

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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int left_h = height(root.left);
        int right_h = height(root.right);
        return Math.max(left_h, right_h) + 1;
    }

    // Diameter of a Tree: Brute force Approach: O(n^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int left_Dia = diameter(root.left);
        int left_height = height(root.left);
        int right_Dia = diameter(root.right);
        int right_height = height(root.right);

        int seft_Dia = left_height + right_height + 1;

        return Math.max(seft_Dia, Math.max(left_Dia, right_Dia));
    }


    // Optimal Approach: O(n)
    static class Info {
        int diameter;
        int height;

        public Info(int dia, int ht) {
            diameter = dia;
            height = ht;
        }
    }

    public static Info diameterOptimal(Node root) {        // Returning the object of the class we created above.
        if (root == null) {
            return new Info(0, 0);
        }
        
        Info leftInfo = diameterOptimal(root.left);
        Info rightInfo = diameterOptimal(root.right);

        int diam = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
        int ht = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diam, ht);
    }    


    public static void main(String[] args) {

        /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
               /
              8
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(8);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter of tree: " + diameter(root));
        
        System.out.println("Diameter of tree: " + diameterOptimal(root).diameter);
        System.out.println("Height of the tree is: " + diameterOptimal(root).height);
    }
}
