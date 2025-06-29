package org.sele;

public class Counting {
    public static void countingSort(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        // Find the maximum element in the array
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println("Maximum element: " + max);

        // Create frequency array with size max+1 to handle index 0 to max
        int[] freq = new int[max + 1];

        // Count frequency of each element - FIXED: iterate through original array, not
        // frequency array
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }

    }

    public static void printArr(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 54, 6, 2, 7, 8, 7, 5, 32, 12 };

        // sort arr - FIXED: store the returned frequency array
        countingSort(arr);

        // print frequency array to see the counts
        System.out.println("Sorted array:");
        printArr(arr);

        System.out.println(); // Add newline for better output formatting

    }

}
