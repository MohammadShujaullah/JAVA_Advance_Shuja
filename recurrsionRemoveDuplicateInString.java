public class recurrsionRemoveDuplicateInString {
    public static boolean map[] = new boolean[26];

    public static void RemoveDuplicates(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.println(newstring);
            return;
        }

        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            RemoveDuplicates(str, idx + 1, newstring);

        } else {
            newstring += currchar;
            map[currchar - 'a'] = true;
            RemoveDuplicates(str, idx + 1, newstring);

        }
    }

    public static void main(String args[]) {

        String str = "abbccda";
        RemoveDuplicates(str, 0, "");
    }
}
