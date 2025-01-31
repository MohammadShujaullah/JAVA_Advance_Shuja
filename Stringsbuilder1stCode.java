import java.util.*;
public class Stringsbuilder1stCode {
public static void main(String args[]){
    StringBuilder sb=new StringBuilder("tony");
    System.out.println(sb);

    //charecter at index 0.
    System.out.println(sb.charAt(0));
    // we can set byusing setCharAt(0,p).// we can replace any letter by using set

    sb.setCharAt(0,'p');
    System.out.println(sb);

    //insert(0,'s')
    sb.insert(0,'s');
    System.out.println(sb);
}
}
