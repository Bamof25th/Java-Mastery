package apnaCollage;

public class binarySearch {

    static int binarysearch(int arr[], int k) {
        int start = 1, end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            // comaprision
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 1829, 324, 3123, 656, 7, 2893, 89 };
        int k = 324;

        int ans = binarysearch(num, k);
        System.out.println(ans);
    }
}
