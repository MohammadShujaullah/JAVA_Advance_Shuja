import java.util.HashMap;

public class HashMap_subarray_sum_equalto_K {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 }; // given
        int k = -10; // given
        HashMap<Integer, Integer> map = new HashMap<>(); // sum(j) -k=sum(i-1);
        map.put(0,1);  //empty subarray
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);

            } else {
                map.put(sum, 1);
            }

        }
        System.out.println(ans);


    }
}
