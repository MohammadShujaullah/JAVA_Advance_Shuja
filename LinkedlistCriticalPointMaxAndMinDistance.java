import java.util.*;

public class LinkedlistCriticalPointMaxAndMinDistance {
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

    public static int[] maxdistance(Node head) {
        ArrayList<Integer> a1 = new ArrayList<>();

        int prev = head.val;
        int index = 1;
        head = head.next;
        while (head != null) {
            int curr = head.val;
            if (head.next != null) {
                int next = head.next.val;
                if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                    a1.add(index);

                }
            }
            head = head.next;
            index++;
            prev = curr;

        }
        int n = a1.size();
        int r[] = { -1, -1 };
        if (a1.size() < 2)
            return r;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a1.size(); i++) {
            min = Math.min(min, a1.get(i + 1) - a1.get(i));

        }
        int max = a1.get(n - 1) - a1.get(0);
        int m[] = { min, max };
        return m;

    }

    public static void criticalpoits(Node head) {
        Node t = head.next;
        while (t.next != null) {
            if (t.val > t.next.val && t.val > t.prev.val) {
                System.out.println(t.val);
            } else if (t.val < t.next.val && t.val < t.prev.val) {
                System.out.println(t.val);
            }
            t = t.next;
        }
    }

    public static void main(String args[]) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);
        Node i = new Node(1);
        Node j = new Node(10);

        a.prev = null;
        a.next = b;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.next = f;
        e.prev = d;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = h;
        h.prev = g;
        h.next = i;
        i.prev = h;
        i.next = j;
        j.prev = i;
        j.next = null;
        display(a);
        // criticalpoits(a);
        maxdistance(a);
    }
}
