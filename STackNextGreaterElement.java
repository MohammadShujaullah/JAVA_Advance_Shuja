

public class STackNextGreaterElement {
    public static void main(String[] args) {
    int arr[] = { 1, 5, 3, 2, 1, 6, 3, 4 };
    int res[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
    res[i]=-1;
    for (int j = i + 1; j < arr.length; j++) {
    if (arr[i] < arr[j]) {
    res[i] = arr[j];
    break;
    }
    }
    }
    for (int i = 0; i < arr.length; i++) { // time compelexity is O(n)
    System.out.print(arr[i] + " ");

    }
    System.out.println();
    for (int i = 0; i < res.length; i++) {
    System.out.print(res[i] + " ");
    }
    }
    
}
