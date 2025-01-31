public class recurrsionIsArraysortedStrictlyincreasing {
    public static boolean IsSorted(int arr[], int idx) {

        if (idx == arr.length - 1) {    // base case .
            return true; 
        }

        if (arr[idx] < arr[idx + 1]) { 
            return IsSorted(arr, idx + 1); // array is sorted till now .

        } else {
            return false;
        }

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4 };
        System.out.println(IsSorted(arr, 0));   // time complexity is O(n)

    }
}
