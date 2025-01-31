import java.util.*;

public class HashSet_LongestCosecutiveElements_inArray {
    public int LongestConsecutive(int[] nums) {
        HashSet<Integr> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }
        int maxstreak = 0;
        for (int num : st) {
            if (!st.contains(num - 1)) {
                int currnum = num;
                int currstreak = 1;
                while (st.contains(num + 1)) {
                    currstreak++;
                    currnum++;

                }
                maxstreak= Math.max(currstreak, maxstreak);
            }

        }
        return maxstreak;

    }
}
