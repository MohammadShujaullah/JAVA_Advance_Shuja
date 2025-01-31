import java.util.*;

public class recurrsionSubSetOfNnaturalno {
    public static void currentsubset(ArrayList<Integer> subsets) {
        for (int i = 0; i < subsets.size(); i++) {
            System.out.print(subsets.get(i) + " ");

        }
        System.out.println();
    }

    public static void Printsubsets(int n, ArrayList<Integer> subsets) {
        if (n == 0) {
            currentsubset(subsets);
            return;
        }

        // add hoga
        subsets.add(n);
        Printsubsets(n - 1, subsets);
        // add nahi hogga
        subsets.remove(subsets.size() - 1);
        Printsubsets(n - 1, subsets);
    }

    public static void main(String args[]) {
        int n = 3;
        ArrayList<Integer> subsets = new ArrayList<>();
        Printsubsets(n, subsets);
    }
}
