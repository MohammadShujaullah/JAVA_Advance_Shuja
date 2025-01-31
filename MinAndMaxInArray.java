import java.util.Scanner;

public class MinAndMaxInArray {
    public static void main(String args[]) { System.out.println("enter the no.of numbers");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }
        int min = number[0];
        int max = number[0];

        for (int i = 0; i < size; i++) {

            if (number[i] < min) {
                min = number[i];
            } else if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("maximum" + max);
        System.out.println("minimum" + min);
    }
}
