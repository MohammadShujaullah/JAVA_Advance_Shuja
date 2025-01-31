import java.util.*;
public class Palindrominpyramid {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }int a=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(a); a--;
            } for (int j=2;j<=i;j++)
            {System.out.print(j);}
       System.out.println(); }

        
    }

}


