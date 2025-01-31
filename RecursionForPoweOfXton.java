public class RecursionForPoweOfXton {
    public static int CalcPower(int x,int n){
    if (n==0){
        return 1;  //base case 1.
    } if (x==0){     // base case 2.
        return 0;
    }

        int x_pow1=CalcPower(x, n-1);     //kaam
        int xpow=x*x_pow1;
        return xpow;

    }
    public static void main(String args []){

        int x=2,n=5;
        int ans =CalcPower(x, n);
        System.out.println(ans );
    }
}
