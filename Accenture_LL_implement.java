import java.util.LinkedList;
import java.util.*;


public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;

    }
}


public class LinkedList{

    Node head;

    //insert at last
    public static void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        Node prev=head;
        while(prev.next!=null){
            prev=pre.next;

        }
        prev.next=newnode;

    }

    //insert at beginning 
    
    public static void insertatbegin(inr data){
        newnode.next=head;
        head=newnode;

    }

    //delete the specific key
    public static void delete(int key){
        if(head==null){
            return;
        }

        if(head.data==key){
            head=head.next;
        }

        Node temp=head;

        while(temp.next!=null && temp.next.data!=key){
            temp=temp.next;
        }

        if(temp.next!=null){
            temp.next=temp.next.next;
        }


    }
    

}

public class Accenture_LL_implement {
   
   
public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list.insert(1);
    list.insert(2);
    
    
}
    
}
