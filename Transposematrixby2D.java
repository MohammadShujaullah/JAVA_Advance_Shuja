import java.util.Scanner;

public class Transposematrixby2D {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of row vs cols");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("so trasposed   matrix is:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i< row; i++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}
