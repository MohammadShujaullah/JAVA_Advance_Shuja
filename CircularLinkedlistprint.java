import org.w3c.dom.Node;

public class CircularLinkedlistprint {
    public static class Node {
        int val;
        Node next; // null
        Node prev; // null

        Node(int val) {
            this.val = val;

        }

    }

    public static void display(Node head) {
        System.out.print(head.val+ " ");
        Node temp = head.next;
        while (temp != head) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;
        display(a);
    }
}
