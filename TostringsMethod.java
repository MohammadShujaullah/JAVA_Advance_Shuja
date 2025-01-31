import java.security.Principal;
import java.security.PublicKey;
import java.util.*;

import javax.print.event.PrintEvent;

public class TostringsMethod {
     public static  String []keyboard={ ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    public static void Printcomb(String str,int idx,String combination) {
       
       if (idx==str.length()){
        System.out.println(combination);
        return;
       }
        char current=str.charAt(idx);
        String mapping= keyboard[current-'0'];
        for(int i=0;i<mapping.length();i++){
 Printcomb(str, idx+1, combination+mapping.charAt(i));
        }
       
    }

    public static void main(String args[]) {
    String str="23";
    Printcomb(str, 0, " ");

    }
}
