import java.util.*;

public class Marks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice");
        int input = sc.nextInt();
        switch (input) {
            case 0: {
                System.out.println("you are out ");
            }
                break;
            case 1: {
                System.out.println("enter the marks");
                int marks = sc.nextInt();
                if (marks >= 90 && marks <= 100) {
                    System.out.println("this is good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("this is also good ");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("this is good aswell");
                } else {
                    System.out.println("invalid ");
                }

                System.out.println("want to continue?? yes(1)no(0)");

            }
        }
    }
}
