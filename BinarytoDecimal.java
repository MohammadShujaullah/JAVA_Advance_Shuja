import java.  util.*;

public class  BinarytoDecimal {
    public static void main(String args[]) {
        System.out.println("enter the binary digit :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = num;
        int d = 0;
        int i = 0;
        while (t > 0) {

            int r = t % 10;
           t= t / 10;
            d = d + r * (int) Math.pow(2, i++); 
        }
        System.out.println(" the decimal form of given binary is " +d);

    }
}
