import java.util.*;

public class EvenNoByFunction {

    public static void EvenNo(int n) {
        if (n % 2 == 0)
            System.out.println("even no");
        else {
            System.out.println("odd");
        }

        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        EvenNo(n);
    }

}
