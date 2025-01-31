public class recurrsionSubstringofStringvvi {
    public static void Substrings(String str ,int idx,String newstring){
         
    if (idx==str.length()){
        System.out.println(newstring);
        return;
    }

        char currchar=str.charAt(idx);

        // to be .
        Substrings(str, idx+1, newstring+currchar);

        // not to be .
        Substrings(str, idx+1, newstring);
    }  
    public static void main(String args []){
        String str ="abc";
        Substrings(str, 0, "");
    }
}
