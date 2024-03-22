package apnaCollage;

public class subArraySum {
    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        subArrSum(num);
    }

    static void subArrSum(int arr[]) {
        int currSum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    currSum += arr[j2];

                }
                System.out.print(" " + currSum + "  ");
            }

        }
        System.out.println("maximum :-" + max);

    }
}
