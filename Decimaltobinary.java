import java.util.*;

public class Decimaltobinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of number ");
        int number, i = 0;
        int binary[] = new int[100];

        number = sc.nextInt();

        while (number > 0) {
            binary[i] = number % 2;
            number =  number/2;       //  we can also  write as number = number>>1.
            i++;

        }
        System.out.println("the binary form of number is :");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }

    }
}
