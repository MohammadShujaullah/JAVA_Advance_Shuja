
public class QuickSort {

    public static int Partition(int arr[], int low, int high) {
        int pivote = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i]; // this swapping is for no.which is smaller than pivote
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivote;// this swapping is for no.which is greater than pivote
        arr[high] = temp;
        return i; // index of pivote.

    }

    public static void Quiksort(int arr[], int low, int high) {
        if (low < high) {

            int pidx = Partition(arr, low, high);
            Quiksort(arr, low, pidx - 1); // for no.which is smaller than pivote
            Quiksort(arr, pidx + 1, high); // for no.which is greater than pivote

        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        Quiksort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");

        }
        System.out.println();
        //time compexity is O(nlogn);
        //tin=me complexity if worst O(n^2)it occurs when pivote is always smallest or biggest .
    }
}
