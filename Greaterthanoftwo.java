
import java.util.*;

public class Greaterthanoftwo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("both are equal");

        } else if (a > b) {
            System.out.println("a is greater ");
        } else {
            System.out.println(" b is greatwr");
        }
    }
}