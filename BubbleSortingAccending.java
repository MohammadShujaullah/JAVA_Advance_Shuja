import java.util.*;

public class BubbleSortingAccending {
    public static void Printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }// its time complexity is O(n^2)

    public static void main(String args[]) {

        int arr[] = { 7, 8, 3, 1, 2 }; // buble sorting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { // same as acending sort

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        Printarray(arr);

    }
}
