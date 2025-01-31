public class QueueImplementByArray {
    public static class queueA {
         static int f = -1;
        static int r = -1;
        static int size = 0;
         static int arr[] = new int[5];

        /// addition
        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("queue is empty");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = val;
            } else {
                arr[++r] = val;

            }
            size++;

        }

        public int remove() {
            if (size == 0) {
                System.out.println("quue is empty ");
                return -1;

            }
            f++;
            size--;
            return arr[f - 1];

        }

        public int peek() {
            if (size == 0) {
                System.out.println("quue is empty ");
                return -1;

            }
            return arr[f]; // same element at f;

        }

        public static void display() {
            if (size == 0) {
                System.out.println("queue is empty");
                return;

            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");

                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();
        q.remove();
        q.display();
       System.out.println( q.peek());
       System.out.println(q.size);

    }
}
