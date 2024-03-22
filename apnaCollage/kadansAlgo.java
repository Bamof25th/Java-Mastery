package apnaCollage;

public class kadansAlgo {
    public static void main(String[] args) {
        int nums[] = { 1, -2, 6, -1, 3 };
        kadanes(nums);
    }

    public static void kadanes(int nums[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

        }
        System.out.println(ms);
    }
}
