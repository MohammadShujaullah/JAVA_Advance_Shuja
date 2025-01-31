import java.util.*;

public class Replaceletterbyanother {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word which contain letter E");
        String word = sc.next();
        String result = " ";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                result += 'i';            
            } else {
                result += word.charAt(i);

            }
        }System.out.println("the letter E is replaced by i");
        System.out.println(result);
    }
}
