import java.util.Stack;

public class STakkinArrayOnly {
    public static class Stack {
        private int[] arr = new int[4];
        private int idx = 0;

        void push(int x) {
            if (isfull()) {
                System.out.println("stack is full");
                return;
            }
            arr[idx] = x;
            idx++;

        }

        int peek() {
            if (idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;

        }

        void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }

        boolean isfull() {

            return (idx == arr.length);

        }

        boolean isEmpty() {
            return idx == 0;

        }

        int capacity() {
            return arr.length;
        }

        int size() {
            return idx;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        System.out.println(st.size());
        st.push(4);

    }
}
