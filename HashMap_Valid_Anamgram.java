import java.util.*;

import javax.management.InstanceAlreadyExistsException;

public class HashMap_Valid_Anamgram {
    public static HashMap<Character,Integer> makeFrequencyMap(String str){
        HashMap<Character,Integer>mp =new HashMap<>();

        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);

            if(!mp.containsKey(ch)){
                mp.put(ch,1);

            }
            else{
                int currfreq=mp.get(ch);
                mp.put(ch,currfreq+1);
            }


        }
        return mp;

    }

 
    public static boolean Isanagram(String s, String t) {  // should have same frequency and same elements with same no.
        if(s.length()!= t.length()){
            return true;
        }
        else{
            return false;
        }
        HashMap<Character,Integer> mp1= makeFrequencyMap(s);
        HashMap<Character,Integer> mp2= makeFrequencyMap(t);

        
        return mp1.equals(mp2);




    }

    public static void main(String[] args) {
        String s = "silent";
        String t= "listen";
        Isanagram(s, t);
        
    }
         
    
     
}
