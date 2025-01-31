
class LL {
    Node head;
    private int size;

    LL(){
       this. size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) { // parametrise constructructer
            this.data = data;
            this.next = null; // at the biginnig node next has null value
             
            size++;    // when we add any data then ,then size will increse .
       
        }
    }

    // add first,
    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    // add last
    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currnode = head;
        while (currnode.next != null) { // iteration till the value goes to null.
            currnode = currnode.next;

        }
        currnode.next = newnode;

    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println(" this is a empty list ");
            return;

        }   size--;   // when we delete it where as from back or front ,
        head = head.next;

    }

    // deletelast
    public void deleteLast() {
        if (head == null) {
            System.out.println("this is a empty list");
        }   
        size --;

        if (head.next ==null){
            head= null;
            return;
        }
        Node secondlast=head;
        Node last =head.next ;
        while (last.next !=null){
            last=last.next;
            secondlast=secondlast.next;

        }
        secondlast.next=null;

    }      public void addInMiddle(int index,String data){

        if (index>size || index<0){
            System.out.println("invalid index value");
            return;
        }

        size++;

         Node newnode =new Node(data);
        if (head==null|| index==0){
          newnode.next=head;
          head= newnode;
          return;
        }

        Node currnode=head;
        for (int i=1;i<size;i++){

            if(i==index){
                Node nextnode=currnode.next;  // relates from swaping of no.
                currnode.next=newnode;       // relates from swaping of no.
                newnode.next=nextnode;     // relates from swaping of no.
                break;
            }
            currnode=currnode.next;

        }
    } 

    public int size(){   // for measuring size of linked list 
        return  size;
    }
    public void reverseIterate(){

        if(head==null || head.next==null){
            return;
        }
        Node prevnode=head;
        Node currnode=head.next;
        while(currnode!=null){
            Node nextnode=currnode.next;
            currnode.next=prevnode;


            // update
            prevnode=currnode;
            currnode=nextnode;

        }  
        head.next=null;
        head=prevnode;


    }

    // print linklist
    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "-->");
            currnode = currnode.next;

        }
        System.out.println("NULL");
    }

}

public class ReverseTheLinkListByItrationMethod {
    public static void main(String args[]) {
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is ");
        list.print();

        list.addlast("list");
        list.print();

        list.addfirst("this");
        list.print();
        list.reverseIterate();
        list.print();

    }
}  
