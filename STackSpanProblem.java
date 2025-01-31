import java.util.Stack;

public class STackSpanProblem {
    public static int[] calculatespans(int prices[]) {
        int spans[] = new int[prices.length];
        spans[0] = 1; // spans of first element is always 1
        Stack<Integer> indexstack = new Stack<>();
        indexstack.push(0);
        for (int i = 1; i < prices.length; i++) {
            while (!indexstack.isEmpty() && prices[indexstack.peek()] <= prices[i]) {
                indexstack.pop();

            }
            // if indexstack is empty ,the prices
            // at index is greater than all previous values

            if (indexstack.isEmpty()) {
                spans[i] = i + 1;

            } else {
                spans[i] = i - indexstack.peek();

            }
            indexstack.push(i);
        }

        return spans;
    }

    public static void main(String[] args) {
        int prices[] = { 100, 80, 60, 70, 60, 75, 85 };
        int spans[] = calculatespans(prices);
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < spans.length; i++) {
            System.out.print(spans[i] + " ");
        }
    }
}
