import java.util.*;

public class Stringsinput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //concatination   bolte han isse 
        String firstname = "tony";
        String lastname = "stark";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        // to find no. of index .
        System.out.println(fullname.length());

        //charAt
        for(int i=0;i<fullname.length();i++){
    System.out.println(fullname.charAt(i));
        }
    }
}
