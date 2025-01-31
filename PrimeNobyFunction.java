import java.util.*;

public class PrimeNobyFunction {
    public static void PrimeNo(int n) {
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag++;
                break;
            }
        }
        if (n == 1) {
            System.out.println("nither pand c");
        } else if (flag == 0) {
            System.out.println("the no. is prime ");
        } else {
            System.out.println("composite");
        }

        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrimeNo(n);
    }
}
