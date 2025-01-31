import java.util.*;

public class Deccendingarray {
    public static void main(String args[]) {
        int temp;
        Scanner sc = new Scanner(System.in);
        int number[] = new int[] { 44, 88, 22, 77, 99 };
        System.out.println("original array");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        for (int i = 0; i < number.length; i++) {

            for (int j = i; j < number.length; j++) {

                if (number[i] < number[j]) {

                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.print("\ndeccending  array\n ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
