import java.util.*;
public class Prime_Number_Optimal_and_seiveOfEreth {

    // public static boolean PrimeNo(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     if(n==2){
    //         return true;
    //     }

    //     if(n%2==0){                // means if any number which is even , is not a prime

    //         return false;

    //     }

    //     // now we only have to check with odd number,upto root(n)

    //     for(int i=3;i*i<=n;i+=2){
    //         if(n%i==0){
    //             return false;
    //         }

    //     }

    //     return true;
        



    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     System.out.println(PrimeNo(n));
    // }




////////////////////////////////////////////////////
/// now, we have to find the number which are prime in arange of 1 to n
////////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isPrime[]=new boolean[n+1];

        Arrays.fill(isPrime,true);

        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i+" ");
            }
        }
    }
}
