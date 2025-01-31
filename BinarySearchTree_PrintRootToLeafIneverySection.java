import java.util.*;

import org.w3c.dom.Node;

public class BinarySearchTree_PrintRootToLeafIneverySection {
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
    // printing the root to leaf all element in  sectionwise
    public static void printpath(ArrayList<Integer> path){
        //only we have to print the list
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+ "-->");
        }
        System.out.println();
    }

    public static void Printroot2leaf(Node root, ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);

        // when we reach leaf
        if(root.left==null && root.right==null){
            printpath(path);

        }// when we at non leaf
        else{
            Printroot2leaf(root.left,path);
            Printroot2leaf(root.right,path);

        }

        path.remove(path.size()-1);

    }
 
    public static void main(String[] args) {
        int value[]={3,5,6,8,10,11,14};
        Node root = null;
        for(int i=0;i<value.length;i++){
            root= Insert(root, value[i]);

        }
        inorder(root);
        System.out.println();
        Printroot2leaf(root,new ArrayList<>());



    }
}
