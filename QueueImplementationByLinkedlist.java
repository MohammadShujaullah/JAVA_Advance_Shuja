
import java.util.*;

public class QueueImplementationByLinkedlist {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;

        }
    }

    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;

            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;

        }

        public int remove() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;

        }

        public int peek() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.val;

        }

        public void display() {
            if (size == 0) {
                System.out.println("queue is empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
         queueLL q=new queueLL();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.display();
         System.out.println(q.peek());

         q.remove();
         q.display();

         


    }
}
