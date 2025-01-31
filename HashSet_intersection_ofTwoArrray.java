import java.util.HashSet;

public class HashSet_intersection_ofTwoArrray {
    public static int intersectionoFArray(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>(); // we have to return the no. of elemet 
                                                  //which is present after intersection of two array
        int count = 0;
        for (int el : arr1) {
            set.add(el);
        }
        for (int el : arr2) {
            if (set.contains(el)) {
                count++;
                set.remove(el);

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
       System.out.println( intersectionoFArray(arr1, arr2));

    }
}
