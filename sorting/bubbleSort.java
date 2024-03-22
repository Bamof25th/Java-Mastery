package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5 };
        // bubbles(arr);
        selectoionSort(arr);
        printArr(arr);

    }

    public static void bubbles(int[] arr) {
        int n = arr.length; // length of array
        for (int turn = 0; turn < n - 1; turn++) {
            for (int i = 0; i < n - 1 - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }

    public static void selectoionSort(int[] arr) {
        int n = arr.length; // length of array
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
