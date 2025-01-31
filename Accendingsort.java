import java.util.*;

public class Accendingsort {
    public static void main(String args[]) {
        int temp;
        int array[] = new int[] { 44, 88, 22, 77, 99 };
        System.out.println("original arrays");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                if (array[i] > array[j]) {

                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        System.out.println();
        System.out.println("accending arrays");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}