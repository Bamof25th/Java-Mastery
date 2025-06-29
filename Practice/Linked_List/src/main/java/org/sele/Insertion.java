package org.sele;

public class Insertion {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // inserting at current position
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 54, 6, 2, 7, 8, 7, 5, 32, 12 };

        // sort arr
        insertionSort(arr);

        // print sorted
        printArr(arr);

    }

}
