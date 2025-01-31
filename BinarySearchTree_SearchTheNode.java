import org.w3c.dom.Node;

public class BinarySearchTree_SearchTheNode {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) { // goes to left tree
            root.left = Insert(root.left, val);

        } /// its takes O(H); time
        else {
            root.right = Insert(root.right, val);

        }
        return root;

    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean Search(Node root, int k) {
        if (root == null) { // its time complexity is O(H)
            return false;
        }
        if (root.data > k) {// goes to left subtree
            return Search(root.left, k);
        } else if (root.data == k) {
            return true;
        } else {    // for the root.dat<k  // its goes right subtree
            return Search(root.right, k);

        }

    }

    public static void main(String[] args) {
        int value[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = Insert(root, value[i]);

        }
        inorder(root);
        System.out.println();
        if (Search(root, 8)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

    }
}
