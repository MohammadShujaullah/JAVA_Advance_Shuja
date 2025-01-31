import java.util.*;

public class BitmanupUpdateBits {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of which opration you want");
        int opration = sc.nextInt();
        // oper=1:set oper=0:clear.
        int n = 5;// 0101
        System.out.println("enter the positon where you want to change");
        int position = sc.nextInt();

        int bitmask = 1 << position;
        if (opration == 1) {
            int newbitmask = bitmask | n;
            System.out.println(newbitmask);

        } else {
            int newbitmask = ~(bitmask);
            int newnumber = newbitmask & n;
            System.out.println(newnumber);
        }
    }

}
