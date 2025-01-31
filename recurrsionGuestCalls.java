
public class recurrsionGuestCalls {

    public static int Callingguests(int n) {
        if (n == 1) {
            return 0;
        } 
        // for single
        int singleways = Callingguests(n - 1);
        // for pair wise
        int pairwise =( (n - 1) * Callingguests(n - 2));
        return singleways + pairwise;
    }

    public static void main(String args[]) {
        int n = 4;
        int totalways = Callingguests(n);
        System.out.println(totalways);
    }
}
