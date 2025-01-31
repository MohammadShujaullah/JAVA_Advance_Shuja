import java.util.*;

public class Arraysofstrings {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int totallength = 0;
        String name[] = new String[size];
        for (int i = 0; i < size; i++) {

            name[i] = sc.next();
            totallength += name[i].length();
        }System.out.println("the total length is:");
        System.out.println(totallength);

    }
}
