import java.util.*;

public class calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int calculation = sc.nextInt();
        switch (calculation) {
            case 1:
                System.out.println("addition" + (a + b));
                break;
            case 2:
                System.out.println("subtaction" + (a - b));
                break;
            case 3:
                System.out.println("multiply" + (a * b));
                break;
            case 4:
                System.out.println("modulo" + (a % b));
                break;
            default:
                System.out.println("null");
        }

    }

}