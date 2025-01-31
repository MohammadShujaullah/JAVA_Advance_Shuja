import java.util.*;

public class STackNextgreaterElementByStack {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        int arr[] = { 1, 5, 3, 2, 1, 6, 3, 4 };
        int res[] = new int[arr.length];
        int n = arr.length;
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = (n - 2); i >= 0; i--) {
            while (st.peek() < arr[i] && st.size() > 0) {
                st.pop();

            }
            if (st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);

        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            // time compelexity is not O(n)
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }
}
