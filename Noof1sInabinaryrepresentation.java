import java.util.*;

public class Noof1sInabinaryrepresentation {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose 1,s you wants");
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            if (( n & 1)==1 ) // we also write it as      if (n%2==0)
            {
                count++;

            }  n= n>>1;       //it also write as            n=n/2;
        }
        System.out.println(count);
        
    }
}
