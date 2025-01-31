
public class RecursionsSumofNnum {
public static int CalculateFactorial(int n){
    if (n==1||n==0){
        return 1;
    }
    int fac_nm1=CalculateFactorial(n-1);
    int fac_n=n*fac_nm1;
    return fac_n;
}
 public static void main (String args []){

    int n=5;
    int ans=CalculateFactorial(n);
    System.out.println(ans );
 }


 //my thyinkiing 
    // public static void PrintSum(int i, int n, int sum) {
      
      
    //    // base case
    //     if (i == n) {

    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i; // work
    //     PrintSum(i + 1, n, sum); // repeat

    // }

    // public static void main(String args[]) {
    //     PrintSum(1,5,0);

    // }

}
