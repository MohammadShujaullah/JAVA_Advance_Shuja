public class recurrsionPermutation {
    public static void Permutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newstring = str.substring(0, i) + str.substring(i + 1);
            Permutation(newstring, permutation + current);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        Permutation(str, "");
    }

}
