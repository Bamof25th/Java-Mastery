
public class One {

    // 2. Find addition of digits of all every individual number in the array

    public static int digitSum(int n) {
        int ans = 0;
        while (n != 0) {
            int t = n % 10;
            ans += t;
            n /= 10;
        }
        return ans;
    }

    public static int addition(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += digitSum(n);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 111, 789 };
        int ans = addition(arr);
        System.out.println("ans" + ans);
    }
}
