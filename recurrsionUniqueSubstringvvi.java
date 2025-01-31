import java.util.HashSet;

public class recurrsionUniqueSubstringvvi {
    public static void UniqueSubstrings(String str, int idx, String newstring, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newstring)) {

                return;

            } else {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }

        }

        char currchar = str.charAt(idx);
        // to be
        UniqueSubstrings(str, idx + 1, newstring + currchar, set);
        // not to be
        UniqueSubstrings(str, idx + 1, newstring, set);
    }

    public static void main(String args[]) {

        String str = "aaa";
        HashSet<String> set = new HashSet<>();
     UniqueSubstrings(str, 0, "", set);
    }
}
