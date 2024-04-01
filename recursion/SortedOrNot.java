package recursion;

public class SortedOrNot {
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;

        if (arr[i] >= arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr1[] = { 4, 23, 2, 67, 89 };
        System.out.println("The array is sorted: " + isSorted(arr1, 0));
    }
}
