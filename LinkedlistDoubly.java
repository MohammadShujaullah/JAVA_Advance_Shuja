
public class LinkedlistDoubly {
    public static class Node {
        int val;
        Node next; // null
        Node prev; // null

        Node(int val) {
            this.val = val;

        }

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    public static void displayrev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;

        }
        System.out.println();
    }

    public static void display2(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;

        } // temp is now at head
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();

    }

    public static Node insertAtHead(Node head, int x) {
        Node newnode = new Node(x);
        newnode.next = head;
        head.prev = newnode;
        head = newnode;

        return head;

    }

    public static void insertAtTail(Node head, int x) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node last = new Node(x);
        temp.next = last;
        last.prev = temp;

    }

    public static void insertAtIdx(Node head, int idx, int x) {
        Node top = head;
        Node t = new Node(x);

        for (int i = 0; i < idx - 1; i++) { // less then is used not = because loop is done 2 times
            top = top.next;

        }
        // Node s=temp;
        // Node r=temp.next;
        // s.prev=t;
        // t.prev=s;
        // t.next=r;
        // r.prev=t;

        // or

        top.next.prev = t;
        t.next = top.next;
        top.next = t;
        t.prev = top;

    }

    public static void deleteHead(Node head) {
        head = head.next;
        head.prev = null;

    }

    public static void deleteTail(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp = temp.prev;
        temp.next = null;

    }

    public static void deleteAtIdx(Node head, int idx) {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++  ) {
            if(temp.next!=null)
            temp = temp.next;

        }
    
           if(temp.next!=null)
        {    temp.next = temp.next.next;
            temp.next.prev = temp;}
        
    }

    public static void main(String args[]) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(11);
        a.prev = null;
        a.next = b;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.next = null;
        e.prev = d;
        display(a);
        // displayrev(e);
        // display2(c);
        // insertAtHead(a,30);
        // Node newhead=insertAtHead(a,30);

        // display(newhead);
        // insertAtTail(a, 90);
        // display(a);

        // insertAtIdx(a, 3, 35);
        // display(a);
        // deleteTail(a);
        // display(a);
        // deleteHead(a);
        // display(b);
        deleteAtIdx(a, 3);
        
        display(a);
        
        

    }
}
