import java.util.*;

public class EmailUsername {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email");
        String email = sc.next();

        System.out.println("your user name is:");
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {

                break;
            }
            System.out.print(email.charAt(i));
        }

    }
}
