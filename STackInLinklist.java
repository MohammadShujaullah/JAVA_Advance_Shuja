public class STackInLinklist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static class stack {
        public static Node head;

        public static boolean isempty() {
            return head == null;
        }

        public static void push(int data) {
            Node newnode = new Node(data);
            if (isempty()) {
                head = newnode;
                return;

            }
            newnode.next = head;
            head = newnode;

        }

        public static int pop() {
            if (isempty()) {
                return -1;

            }
            int top = head.data; // delete the top ,and second top becone head
            head = head.next;

            return top;

        }

        public static int peek() {
            if (isempty()) {
                return -1;

            }
            int top = head.data;
            return top;

        }
    }

    public static void main(String args[]) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }
}
