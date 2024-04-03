package apnaCollage;

public class rotatedsrtedArr {
    public static int search(int[] arr, int target, int si, int ei) {
        // modified binary search
        // baecase
        if (si > ei)
            return -1;
        // kaam
        int mid = si + (ei - si) / 2;

        // case Found
        if (arr[mid] == target) {
            return mid;
        }

        // mid lies on line 1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                // left search
                return search(arr, target, si, mid - 1);
            } else {
                // right search
               return search(arr, target, mid + 1, ei);
            }
            // mid lies on line 2
        } else {
            // right search
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // left search
                return search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

}
