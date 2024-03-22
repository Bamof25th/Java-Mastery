package apnaCollage;

public class reverseArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 1829, 324, 3123, 656, 7, 2893, 89 };
        printReverseArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }

       }

    static void printReverseArray(int arr[]) {
        int n = arr.length;
        int temp = 0;
        int i = 0;
        int j = n - 1;

        while (i < j) {

            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;

        }
       
    }
}
