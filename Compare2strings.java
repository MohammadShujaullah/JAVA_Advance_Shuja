import java.util.*;

public class Compare2strings {
  public static void main(String args[]) {

    String name1 = "tony";
    String name2 = "tony";

    // 1. s1>s2: +ve value .
    // 2. s1<s2 -ve value .
    // s1==s2 0 value .
//like hallo<cello.   remmeber it .
    if (name1.compareTo(name2) == 0) {
      System.out.println("strings are equal");

    } else {
      System.out.println("strings are not equal");
    }

    if (name1 == name2) {
      System.out.println("both strings are equal");
    } else {
      System.out.println(" string are diffrent ");
    }

    // both are same but some time == wrong work takes .so we consider compare

    // like for example
    if (new String("tony") == new String("tony")) {
//this gives wrong answer 
      System.out.println("both strings are equal");
    } else {
      System.out.println("string not equal");
    }

  }
}
