package sorting;

public class HeapSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }

    }

    public static void heapSort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int j = n - 1; j >= 0; j--) {
            swap(arr, 0, j);
            heapify(arr, j, 0);
        }

    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Original array:");
        java.util.Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();

        heapSort(arr);

        System.out.println("Sorted array:");
        java.util.Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
