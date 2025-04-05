package Alpha_19_Binary_Tree;

public class CWH_04_Count_of_Nodes_of_Tree_and_Sum_of_Nodes extends CWH_03_Height_of_a_Tree{
    
    // Time complexity : O(n) 
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int left_Count = countNodes(root.left);
        int right_Count = countNodes(root.right);
        int total_count = left_Count + right_Count + 1;   // left child count + right child count + 1 (self count);
        return total_count;
    }

    // Time complexity : O(n) 
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int left_sum = sumOfNodes(root.left);
        int right_sum = sumOfNodes(root.right);
        int total_sum = left_sum + right_sum + root.data;
        return total_sum;
    }

    public static void main(String[] args) {
        /*
                        1
                       /  \
                      2    3
                     / \   / \
                    4   5 6   7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Count of nodes in the tree is: " + countNodes(root));
        System.out.println("Sum of nodes in the tree is: " + sumOfNodes(root));
    }
}
