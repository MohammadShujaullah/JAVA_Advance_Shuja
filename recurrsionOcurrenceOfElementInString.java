public class recurrsionOcurrenceOfElementInString {
    public static int first = -1;
    public static int last = -1;

    public static void OccurenceOfElement(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);    //base case .
            System.out.println(last);
            return;
        }
        char currechar = str.charAt(idx);
        if (currechar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

        }
        OccurenceOfElement(str, idx + 1, element);
    }

    public static void main(String arhs[]) {

        String str = "abaacdaefaah";
        OccurenceOfElement(str, 0,'a'); // time complexity is O(n )
    }
}
