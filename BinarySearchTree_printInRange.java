import org.w3c.dom.Node;

public class BinarySearchTree_printInRange {
        public  static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
        }
    }
    public static Node Insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }   
        if(root.data>val){  //goes to left tree 
            root.left= Insert(root.left, val);

        }
        else{
            root.right=Insert(root.right,val);

        }
        return root;


    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static void printInRange(Node root,int x,int y){
        if(root==null){
            return;
        }// print in a accending order  so, Inorder traversal should be done 
        if(root.data>=x && root.data<=y){
                                           //so we have to go both  first in left and also right
           printInRange(root.left, x, y); 
           System.out.print(root.data + " ");
           printInRange(root.right, x, y);                             
        }
        else if (root.data<x){
            printInRange(root.right, x, y);
        } else if (root.data>y){
            printInRange(root.left, x, y);
        }
    }
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<value.length;i++){
            root= Insert(root, value[i]);

        }
        inorder(root);
        System.out.println();
         printInRange(root, 4, 7);


    }
}
