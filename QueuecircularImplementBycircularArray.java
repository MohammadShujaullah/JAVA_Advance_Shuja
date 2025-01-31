import java.util.*;

public class QueuecircularImplementBycircularArray {
    public static class CqueueA {
        static int f = -1;
        static int r = -1;
        static int size = 0;
        static int arr[] = new int[5];

        /// addition
        public void add(int val) {
            if (size == arr.length) {
                System.out.println("queue is full");

            } else if (size == 0) {
                f = r = 0;
                arr[0] = val;
            } else if (r < arr.length - 1) {
                arr[++r] = val;

            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = val;

            }
            size++;

        }

        public static int remove() {
            if (size == 0) {
                System.out.println("quue is empty");

            } else if (f < arr.length - 1) {
                f++;
                size--;
                return arr[f - 1];
            } else if (f == arr.length - 1) {
                int x = arr[f];
                f++;
                size--;
                return x;
            }
            return -1;
        }

        public static int peek() {
            if (size == 0) {
                System.out.println("quue is empty ");

            }
            return arr[f];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public static void display() {
            if (size == 0) {
                System.out.println("queue is empty");
                return;

            } else if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");

                }
            } else if (f > r) {
                for (int i = f; i <= arr.length - 1; i++) {
                    System.out.print(arr[i] + " ");

                }
                for (int i = 0; i <= r; i++) {
                    System.out.println(arr[i]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CqueueA q = new CqueueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();

        q.remove();
        q.display();
        q.add(6);
        q.display();
        q.add(7);
        // System.out.println(q.peek());
        // q.display();
        // System.out.println(q.size);

        for (int i = 0; i < q.arr.length; i++) {
            System.out.print(q.arr[i] + " ");

        }

    }
}
