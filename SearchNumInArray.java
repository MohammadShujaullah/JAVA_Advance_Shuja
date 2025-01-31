import java.util.Scanner;// this method is also knwn as LINEAR SEARCH.

public class SearchNumInArray {

    public static void main(String args[]) {
        System.out.println("enter the numbers");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }
        System.out.println("enter the no. whose index you want");
        int x = sc.nextInt();
        for (int i = 0; i <number.length; i++) {//number.length=size we can also use this.

            if (x == number[i])
                System.out.println("the index of the no.is" + i);
        }
    }
}
