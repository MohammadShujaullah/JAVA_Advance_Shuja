import java.util.*;

public class STackBalancedBrackets {

    public static boolean isbalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);

            } else { // chr is "("
                if (st.size() == 0) {  // if before the end of for  
                                       //loop size become zero the false and 
                                       //after for loop  size should be zero for return true 
                    return false;
                }
                if (st.peek() == '(') {
                    st.pop();

                }
            }
        }
        if (st.size() > 0) {

            return false;

        } else {
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(isbalanced(str));

    }
}
