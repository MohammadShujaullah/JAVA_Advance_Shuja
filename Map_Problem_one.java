import java.util.Map;

import java.util.HashMap;

public class Map_Problem_one {
    public static void main(String[] args) { // question is inside copy

        int arr[] = { 1, 4, 2, 5, 4, 4, 4, 6, 4, 4 };
        Map<Integer, Integer> freq = new HashMap<>();
        for (var e : arr) {
            if (!freq.containsKey(e)) {
                freq.put(e, 1);
            } else {
                freq.put(e, freq.get(e) + 1);

            }

        }
        System.out.println(freq.entrySet());
        int maxfreq = 0, anskey = -1;

        for (var key : freq.entrySet()) {      //we can use the keys only to do this things
            if (key.getValue() > maxfreq) {
                maxfreq = key.getValue();
                anskey = key.getKey();

            }
        }
        System.out.println("frequency table");
        System.out.println(anskey + " has the max frequency  occurs  " + maxfreq + " times");

    }
} // its time complexity is O(n)
