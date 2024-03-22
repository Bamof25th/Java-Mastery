package apnaCollage;

public class printSubArray {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 7, 8 };
        subArr(num);
    }

    static void subArr(int arr[]) {
        int ts = 0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(arr[j2] + "");
                    ts++;
                }
                System.out.println();
            }
            
        }
        System.out.println(ts);
    }
}
