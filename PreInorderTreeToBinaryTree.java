import java.util.Queue;
import java.util.*;
 class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

public class PreInorderTreeToBinaryTree{

   

    public static void printlevelorder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);


        while(!q.isEmpty() ){
            Node curr=q.remove();

            if(curr==null){
                System.out.println();
                
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    
                }

            }
            else{
                System.out.println(curr.val+"->");

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }

    static int preindex = 0;

    public static Node buildtree(int inorder[], int preorder[], int inStart, int inEnd, HashMap<Integer, Integer> map) {
        if (inStart > inEnd) {
            return null;
        }
        Node newNode = new Node(preorder[preindex++]); // root
        int rootidx = map.get(newNode.val);

        newNode.left = buildtree(inorder, preorder, inStart, rootidx - 1, map);
        newNode.right = buildtree(inorder, preorder, rootidx + 1, inEnd, map);

        return newNode; // root

    }

    public static void buildTreeAndPrintLevelOrder(int inorder[], int preorder[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);

        }

        preindex = 0;// reset preindex for every call

        Node root = buildtree(inorder, preorder, 0, inorder.length - 1, map);
        printlevelorder(root);

    }

    public static void main(String[] args) {
        int inorder[] = { 4, 2, 5, 1, 6, 3, 7 };
        int preorder[] = { 1, 2, 4, 5, 3, 6, 7 };

        System.out.println("the Lveleorder traversal of tree is : ");

        buildTreeAndPrintLevelOrder(inorder, preorder);
    }
}
