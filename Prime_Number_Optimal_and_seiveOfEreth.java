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
/// seive of erethosthenes
////////////////////////////////////////////////////
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     boolean isPrime[]=new boolean[n+1];

    //     Arrays.fill(isPrime,true);

    //     isPrime[0]=false;
    //     isPrime[1]=false;
    //     for(int i=2;i*i<=n;i++){
    //         if(isPrime[i]){
    //             for(int j=i*i;j<=n;j+=i){
    //                 isPrime[j]=false;
    //             }
    //         }
    //     }

    //     for(int i=2;i<=n;i++){
    //         if(isPrime[i]){
    //             System.out.println(i+" ");
    //         }
    //     }
    // }






    // now we have to find the missing number in an array of 0 to n

//    public static int missing(int arr[]){
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]!=i){
//                 return i;
//             }
//         }

//         return -1;
//     }
//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);

//     int n=sc.nextInt();
//     int arr[]=new int[n+1];

//     for(int i=0;i<=n;i++){
//         arr[i]=sc.nextInt();
//     }

//     System.out.println(missing(arr));
//    }



// now we have to reverse the string word by word
public static String reverse(String str){
   StringBuilder result=new StringBuilder();

    String word[]=str.split(" ");
    for(String w:word){
         StringBuilder sb=new StringBuilder(w);
         sb.reverse();
         result.append(sb.toString()+" ");




    }

    return result.toString().trim();     // trim is imp for last string , 
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    System.out.println(reverse(str));
}
}
