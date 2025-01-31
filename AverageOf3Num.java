import java.util.Scanner;

public class AverageOf3Num {
        public static void AverageOf3Num(int a,int b,int c) {
        
            int average=(a+b+c)/3;
         {
            System.out.println("the average of three"+average);
        }

        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        AverageOf3Num(a, b, c);
    }

}
