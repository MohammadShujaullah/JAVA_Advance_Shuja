import java.util.Scanner;

public class HcfOfTwoNum {

    public static int min(int a, int b) {

        if (a < b)
            return a;
        else
            return b;
    }

    public static int Gcd(int a, int b) {

        int hcf = 0;
        for (int i = 1; i <= min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;

            }

        }
        return hcf;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = Gcd(a, b);

        System.out.println(hcf);
    }
}
