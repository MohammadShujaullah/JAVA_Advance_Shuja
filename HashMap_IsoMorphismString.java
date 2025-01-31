import java.util.*;
public class HashMap_IsoMorphismString {
    public static boolean isIsomorphism(String s,String t){
        HashMap<Character,Character> mp =new HashMap<>();
        fopr (int i=0;i<s.length();i++){
            Character sch= s.charAt(i);
            Character tch= t.charAt(i);
         
            if(mp.containskey(sch)){
                if(mp.get(sch)!=tch){
                    return false;

                }
                else if(mp.containsValue(tch)){
                    return false;

                }
            }else{
                mp.put(sch, tch);
            }

        }
        return true;

    }public static void main(String[] args) {
        String s = "abcd";             //one value only assign to one key
                                       // if one key has diff.value then only thr first value is valid 

        String t = "wxyx";

    }
}
