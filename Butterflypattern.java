import java.util.*;

public class Butterflypattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }//lowe half
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
