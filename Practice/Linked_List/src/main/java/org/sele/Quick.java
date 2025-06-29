package org.sele;

public class Quick {

    public static void quickSort(int[] arr) {

    }

    public static void printArr(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 54, 6, 2, 7, 8, 7, 5, 32, 12 };

        quickSort(arr);

        System.out.println("Sorted array:");
        printArr(arr);

        System.out.println(); // Add newline for better output formatting

    }

}
