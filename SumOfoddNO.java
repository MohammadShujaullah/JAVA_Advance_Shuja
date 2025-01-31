import java.util.Scanner;

public class SumOfoddNO {
         public static void SumOfoddNO (int a) {
        
        int sum=0;
            for(int i=1;i<=a;i++){
        if(i%2!=0){

        sum=sum+i;
        }

    
           
        } System.out.println("sumof ath term are"+sum);

        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
  SumOfoddNO(a);
    
    }

}
