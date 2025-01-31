import java.util.Scanner;

public class NoOfZeroPOsneg {

   public static void main(String args[]) {

      System.out.println("enter the no.you wants:");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int positive = 0;
      int negative = 0;
      int zero = 0;
      int i = 1;
      while (i <= n) {
         System.out.println("enter the number :");
         int num = sc.nextInt();
         if (num > 0) {
            positive++;
         } else if (num == 0) {
            zero++;
         } else if (num < 0) {
            negative++;
         }
     i++;  }
      System.out.println("THE POSITIVE NO are" + positive);
      System.out.println("the no of zeros are" + zero);
      System.out.println("the negative no are" + negative);
   }
}
