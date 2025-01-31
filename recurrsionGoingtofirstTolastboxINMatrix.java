public class recurrsionGoingtofirstTolastboxINMatrix {

    public static int Countpaths(int i,int j,int n,int m){
       if (i==n||j==m){
        return 0;
       } if (i==n-1||j==m-1){
        return 1;
       }
        
        // for downward 
        int downwardpaths=Countpaths(i+1, j, n, m);
        // for rigth ward 
        int rightwardpaths=Countpaths(i, j+1, n, m);
        return downwardpaths+rightwardpaths;

    }
    public static void main (String args[]){
        int n=3;int m=3;
       int totalpaths=Countpaths(0, 0, n, m);
       System.out.println(totalpaths);
    }
}
