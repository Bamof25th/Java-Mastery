package recursion;

public class occurence {
    public static int firstOccur(int[] arr, int k, int i) {

        if (i == arr.length)
            return -1;

        if (arr[i] == k) {
            return i;
        }

        return firstOccur(arr, k, i + 1);
    }

    public static int lastOccur(int[] arr, int k, int i) {

        if (i == arr.length)
            return -1;

        int isFound = lastOccur(arr, k, i + 1);
        if (isFound == -1 && arr[i] == k) {
            return i;
        }

        // // check with self
        // if (arr[i] == k) {
        // return i;
        // }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 53, 422, 34, 12, 3, 4, 6 };

        System.out.println(lastOccur(arr, 3, 0));
    }
}
