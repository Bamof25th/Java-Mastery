package org.sele;

public class Bubble {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;

    }

    public static void printArr(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 54, 6, 2, 7, 8, 7, 5, 32, 12 };

        // sort arr
        bubbleSort(arr);

        // print sorted
        printArr(arr);

    }

}