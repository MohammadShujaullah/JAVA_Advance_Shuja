import java.util.Scanner;

public class XraiseToPOWER {
             public static void XraiseToPOWER   (int x,int n) {
        
        int a=1;
            for(int i=1;i<=n;i++){
           a=a*x;
    
           
        } System.out.println("x raise to the power n="+a);

        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();int n = sc.nextInt();
  XraiseToPOWER(x,n);;
    
    }
}
