package apnaCollage;

public class pairsInAnArray {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 7, 8 };
        pairs(num);
    }

    static void pairs(int arr[]) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println(totalPairs);

    }
}
