public class RcursionFactorialofN {
    public static void PrintSum(int i, int n, int factorial) {
        // base case
        if (i == n) {

            factorial *= i;
            System.out.println(factorial);
            return;
        }
        factorial *= i; // work
        PrintSum(i + 1, n, factorial); // repeat

    }

    public static void main(String args[]) {
        PrintSum(1,5,1);

    }

}
