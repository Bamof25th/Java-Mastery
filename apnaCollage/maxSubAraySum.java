package apnaCollage;

public class maxSubAraySum {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int currSum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    currSum += nums[j2];
                }
                if (max < currSum) {
                    max = currSum;
                }
            }

        }
        return max;
    }
}


//*   base cases 

// int currSum = 0;
// int max = 0;
// if (nums.length == 1)
//     return nums[0];
// if (nums.length == 2)
//     return nums[0] + nums[1];
// for (int i = 0; i < nums.length; i++) {

//     for (int j = i; j < nums.length; j++) {
//         currSum = 0;
//         for (int j2 = i; j2 <= j; j2++) {
//             currSum += nums[j2];
//         }
//         if (max < currSum) {
//             max = currSum;
//         }
//     }

// }
// return max;
// }