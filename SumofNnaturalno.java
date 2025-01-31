import java.util.*;

public class SumofNnaturalno {
    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int counter = 1; counter <= n; counter++)
            sum = sum + counter;
        System.out.println("sum is=" + sum);
    }
}
