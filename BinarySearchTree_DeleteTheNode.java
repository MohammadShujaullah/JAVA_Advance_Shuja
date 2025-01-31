import org.w3c.dom.Node;

public class BinarySearchTree_DeleteTheNode {
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
    
    /// deleting the node hase 3 cases  so as below

    public static Node inOrderSuccessor(Node root){ // inordrsuccesor is*( left most node in right subtree)
        while(root!=null){
            root= root.left;
        }
        return root;
    }

    public static Node Delete(Node root,int val){
        if(root.data>val){
            root.left= Delete(root.left, val);

        }else if(root.data<val){
            root.right= Delete(root.right, val);
        }
        else{// for   root.data==val
            //case1
            if(root.left==null && root.right==null){
                return null;
            }

            //case2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //case3
                Node IS=inOrderSuccessor(root.right);
                root.data=IS.data;
                root.right= Delete(root.right, val);

            


        }
        return root;

    }
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<value.length;i++){
            root= Insert(root, value[i]);

        }
        Delete(root, 4);
        inorder(root);
        



    }
}
