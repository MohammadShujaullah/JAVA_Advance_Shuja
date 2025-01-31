import java.util.*;

public class ReveseTheLinkListByCollectionMethod {
    public static void main(String args[]) {
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);  // time complexity is O(N)
        Collections.reverse(list2);  // space complexity is O(1)
        System.out.println(list2);
    }

}
