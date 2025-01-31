import java.util.*;

public class Facctorial {
    public static void Factorial(int n) {
        if (n < 0)
            System.out.println("invalid no.");
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);

        return ;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Factorial(n);

    }
}
