public class recurrsionReversingString {
    public static void Printreverse(String str,int idx){
    if (idx==0){
        System.out.println(str.charAt(idx));
        return;
    }
        System.out.print(str.charAt(idx));
        Printreverse(str, idx-1);
    }
    public static void main (String args [])
    {
      String str="abcd";
      int idx=str.length()-1;

Printreverse(str, idx); // time complexity of this is O(n)
    }
}
