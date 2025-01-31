public class FindSubStrings {
    public static void main(String args[]) {
        String sentence = "my name is tony stark";
        // substring( biggning index,ending index).
      
        String name1 = sentence.substring(11, 15);//end is exclusive
        System.out.println(name1);
       
       
        String name2 = sentence.substring(16);
        System.out.println(name2);
    }
}

// strings are mutable it cannot be changed or modified till the help of new
// string.