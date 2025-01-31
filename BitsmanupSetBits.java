public class BitsmanupSetBits {
    public static void main(String args[]) {
        int n = 5;//  0101 .we have to convert it to 7 (0111)
        int position = 1;
        // step 1 //                                       1.bitmask:1<<i;
        int bitmask = 1 << position;                // 2.operation: OR
        // step 2.
        // step 2.
        int newnumber =bitmask| n;// or 
        System.out.println(newnumber );
    }

}
