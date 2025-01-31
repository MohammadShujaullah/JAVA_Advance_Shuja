public class BitmanupClearBits {
    public static void main(String args[]) {
        int n = 5;//  0101 .we have to convert it to 7 (0111)
        int position = 2;
        // step 1                          //  1.bitmask:1<<i;
        int bitmask = 1 << position;      // 2.operation:AND with NOT of bitmask
        // step 2.
         int compbitmask=~(bitmask);
         int newnumber =compbitmask & n;
        System.out.println(newnumber );
    }
}
