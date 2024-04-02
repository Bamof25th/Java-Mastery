
package sorting;

public class mergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void mrgSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }

        // faith
        int mid = si + (ei - si) / 2;

        mrgSort(arr, si, mid); // Left side
        mrgSort(arr, mid + 1, ei); // Right side
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temporary array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // temp fo fill the left over elements
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];

        }
        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 5, 56, 67, 98, 9, 8, 1 };
        mrgSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
