public class recurrsionMoveAllXtoEnd {
    public static void MoveAllx(String str, int idx, int count, String newstring) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) { // base case .
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }
        char currenchar = str.charAt(idx);
        if (currenchar == 'x') {
            count++;
             
        } else {
            newstring += currenchar;
           
        } MoveAllx(str, idx+1, count, newstring);
    }

    public static void main(String args[]) { // time complexity is O(n+count)=O(2n)=O(n).

        String str = "axbcxxd";
        MoveAllx(str, 0, 0, "");
    }

}
