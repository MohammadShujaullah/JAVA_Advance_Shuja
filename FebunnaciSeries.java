import java.util.Scanner;

public class FebunnaciSeries {
    public static void FebunnaciSeries(int n) {

        int a = 1;
        int b = 1;
        int sum = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int j = 1; j <= n; j++) {
            sum = a + b;
            a = b;
            b = sum;

            System.out.print(sum + " ");
        }

        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FebunnaciSeries(n);
    }
}
