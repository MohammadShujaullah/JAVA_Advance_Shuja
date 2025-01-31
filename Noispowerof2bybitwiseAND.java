import java.util.*;

public class Noispowerof2bybitwiseAND {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            int n = sc.nextInt();
            int val = (n & (n - 1));
            if (val == 0) {

                System.out.println("ispower of two");
            } else {
                System.out.println("FALSE it is not power of two");
            }

        }

    }
}
