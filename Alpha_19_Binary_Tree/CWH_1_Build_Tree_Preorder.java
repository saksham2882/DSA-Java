package Alpha_19_Binary_Tree;

public class CWH_1_Build_Tree_Preorder {

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

    // This class will construct a Binary Tree.
    static class BinaryTree {
        static int index = -1;                       // Using static ensures the index updates in every recursive call.

        public Node buildTree(int node[]) {
            index++;                                 // at first index become zero which means we will create our first node.

            if (node[index] == -1) {                 // means null as a subtree
                return null;
            }

            Node newNode = new Node(node[index]);    // root or parent node
            newNode.left = buildTree(node);          // recursive call for left chid
            newNode.right = buildTree(node);         // recursive call for right chid

            return newNode;                          // here we return only root node or parent node
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };  // -1 represent null

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
    }
}