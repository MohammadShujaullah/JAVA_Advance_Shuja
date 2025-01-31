public class recurrsionPlaceTiles {
    public static int Placetiles(int n,int m){
       //base casr 1-
       if (n==m){
        return 2;
       } //base case 2-
        if (n<m){
            return 1;

       }
       
        int verticaltiles=Placetiles(n-m, m);
        int horizontaltiles=Placetiles(n-1, m);
        return verticaltiles+horizontaltiles;

    }
    public static void main (String args[]){
        int n=2;int m=2;
             int totalways =Placetiles(n, m);
 System.out.println(totalways);   }
}
