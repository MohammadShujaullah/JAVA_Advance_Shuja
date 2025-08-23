import java.util.*;

public class Practice_Accenture_Question {
    // public static int solve(int r, int unit, int arr[]) {

    // if(arr.length==0){
    // return -1;
    // }
    // int total = r * unit;
    // int count = 0;
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {

    // sum=sum+arr[i];
    // count++;
    // if(count>=total)

    // }
    // if(sum<total){
    // return 0;
    // }

    // return count;

    // }

    // public static void main(String args[]){

    // Scanner sc =new Scanner(System.in);

    // int r=sc.nextInt();
    // int unit=sc.nextInt();
    // int n=sc.nextInt();

    // int arr[]= new int [n];

    // for(int i=0;i<n;i++){
    // arr[i]=sc.nextInt();
    // }

    // System.out.println(solve(r,unit,arr));

    // }

    // public static int solve(String s) {

    // if (s.length() == 0)
    // return -1;
    // int result = s.charAt(0) - '0';
    // int i = 1;
    // while (i <= s.length() - 2) {
    // if (s.charAt(i) == 'C') {
    // result = result ^ (s.charAt(i + 1) - '0');
    // i = i + 2;

    // } else if (s.charAt(i) == 'B') {
    // result = result | (s.charAt(i + 1) - '0');
    // i = i + 2;

    // } else if (s.charAt(i) == 'A') {
    // result = result & (s.charAt(i + 1) - '0');
    // i = i + 2;

    // }
    // }

    // return result;

    // }

    // public static void main(String[] args) {
    // String s = "1C0C1C1A0A1";// given :String must be odd in length

    // System.out.println(solve(s));

    // }

    public static int CheckPassword(String s) {

        int num = 0;
        int upper = 0;
        // 1st condition
        if (s.length() < 4)
            return 0;
        // 2nd condition
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
            return 0;

        // 3rd condition and so on conditions are checking inside the for loop
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i) == '/') {
                return 0;

            }

            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upper++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num++;
            }

        }
        if (upper < 1 || num < 1) {
            return 0;
        }
        return 1;

        // you are thinking how we put condition of greater than and smaller than on a
        // charecter of alphabet and number , is because all charecter are also a number
        // so when we writr condition on it , it takes its ASCII values and do the
        // condition , see chatgpt to better explaination
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(CheckPassword(s));

    }
}
