import java.util.Scanner;

public class Zeroonetriangle {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

 int a=1;
        for (int i = 1; i <= n; i++) {
            if(i%2==0)a=0;
            else a=1;
        
            for (int j = 1; j <= i; j++) {

                System.out.print(a );
                 if(a==1)
                 a=0;
                 else a=1;
            }
            
            System.out.println();
        }

    }
}
