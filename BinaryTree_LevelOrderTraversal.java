import org.w3c.dom.Node;
import java.util.*;

public class BinaryTree_LevelOrderTraversal {
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

    public static void Levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currnode = q.remove();
            if (currnode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                System.out.print(currnode.data + " ");
                if (currnode.left != null) {
                    q.add(currnode.left);
                }
                if (currnode.right != null) {
                    q.add(currnode.right);

                }

            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        System.out.println(sumOfK(root, 2));

    }
}
