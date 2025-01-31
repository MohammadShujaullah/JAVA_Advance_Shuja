import org.w3c.dom.Node;

public class BinaryTree_HeightOfTree {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;

        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lefthight = height(root.left); // O(n)ecause we iteratre only
                                           // one time on one node
        int rightheight = height(root.right);  //here we count level of the tree or height

        return Math.max(lefthight, rightheight) + 1;
    }

  

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        System.out.println(height(root));

    }

}
