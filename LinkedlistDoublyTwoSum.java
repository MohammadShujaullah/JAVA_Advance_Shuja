import org.w3c.dom.Node;

public class LinkedlistDoublyTwoSum {
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

    public static void twoSum(Node head, int target) {
        Node h = head;
          
        Node temp = head;
        while (temp .next!= null) {
            
            temp = temp.next;

        }
        Node t=temp;
        while (h.val < t.val) {
            if (h.val + t.val == target) {
                System.out.println("the elements are:"+h.val+"   "+ t.val);
                break;
            } else if (h.val + t.val > target) {
                t = t.prev;
            } else {
                h = h.next;

            }

        }
    }

    public static void main(String args[]) { 

        // sorted linkedlist in non decreasing order
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(13);
        Node e = new Node(100);
        

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
        twoSum(a,18);
        
    }

   
    
}
