import java.util.Scanner;

public class MinMaxArray2ndMthod {

    public static void main(String args[]) {
        System.out.println("enter the no.of numbers");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size==0) return;
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }
        int min = number[0];
        int max = number[0];

        for (int i = 0; i < size; i++) {

            max = Math.max(max, number[i]);
            min = Math.min(min, number[i]);
        }
        System.out.println("maximum" + max);
        System.out.println("minimum" + min);
    }
}
