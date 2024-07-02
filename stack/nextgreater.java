package stack;

import java.util.Stack;

public class nextgreater {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums[s.peek()] <= nums[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = nums[s.peek()];
            }
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        int nextarr[] = nextGreaterElements(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.print( nextarr[i] + ",");
        }
    }
}
