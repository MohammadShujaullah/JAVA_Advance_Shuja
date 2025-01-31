import java.util.Scanner;

public class Linearsearchinmatrix {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of row and cols");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[row][cols];
        System.out.println(" enter the matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println(" enter the value of no. whose index you want ");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x)
                    System.out.print("the index is" +    i + " x" + j);

            }
            System.out.println();
        }

    }
}
