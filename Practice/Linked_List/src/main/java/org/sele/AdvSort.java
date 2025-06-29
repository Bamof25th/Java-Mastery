package org.sele;

//Merge Sort
public class AdvSort {
    public static void mergeSort(int[] arr, int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // mid
        int mid = si + (ei - si) / 2;

        // inner call

        // left divide
        mergeSort(arr, si, mid);

        // right divide
        mergeSort(arr, mid + 1, ei);

        // now call merge to combine and get sorted array
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        // creating a temp array to merge
        int[] temp = new int[ei - si + 1];

        int l = si; // left array iterator
        int r = mid + 1; // right array iterator
        int k = 0; // temp array iterator

        while (l <= mid && r <= ei) {
            if (arr[l] < arr[r]) {
                temp[k] = arr[l];
                l++;
            } else {
                temp[k] = arr[r];
                r++;
            }
            k++;
        }

        // for leftover elem at left
        while (l <= mid) {
            temp[k++] = arr[l++];
        }
        // for leftover elem at right
        while (r <= ei) {
            temp[k++] = arr[r++];
        }

        // copy the temp in original arr
        for (int i = 0, j = si; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }

    }

    public static void printArr(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 54, 6, 2, 7, 8, 7, 5, 32, 12 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArr(arr);

        System.out.println(); // Add newline for better output formatting

    }
}
