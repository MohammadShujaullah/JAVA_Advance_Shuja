public class MergeSort {  
    
    // it hase two partfirst is devide and secomnd is conquer
    // its time complexity is O(nlogn)base 2
    public static void Conquer(int arr[], int mid, int si, int ei) {
// its time is O(n)
        int merged[] = new int[ei - si + 1];
        int idx1 = si; // for rightsided array
        int idx2 = mid + 1; /// for left sided array
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];

            } else {
                merged[x++] = arr[idx2++];

            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];

        }

    }

    public static void Devide(int arr[], int si, int ei) {// its time is O(logn)with base2
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        Devide(arr, si, mid);
        Devide(arr, mid + 1, ei);
        Conquer(arr, mid, si, ei);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        Devide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}
