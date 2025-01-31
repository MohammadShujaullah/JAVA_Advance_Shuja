import org.w3c.dom.Node;

public class BinaryTree_Diameter_OfTreeTimecomp_O_n {
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
    public class TreeInfo{
        int h;
        int diam;
        TreeInfo(int h,int diam ){
            this.h= h;
            this.diam =diam;

        }
    }

 

    public static TreeInfo diameter(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left =diameter(root.left);
        TreeInfo right =diameter(root.right);

        int maxheight = Math.max(left.h,right.h)+1;

        int d1 = left.diam;    // this code  time comp .O(n square)
        int d2 = right.diam;
        int d3 = left.h +right.h +1;

        int maxdiam= Math.max(d3,Math.max(d2,d1));
        TreeInfo myInfo =  new TreeInfo(maxheight, maxdiam);
        return myInfo;
        
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        System.out.println(diameter(root).diam);

    }
}

