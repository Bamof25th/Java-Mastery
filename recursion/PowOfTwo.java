package recursion;

public class PowOfTwo {

    // public static int power(int x, int n) {
    // if (n == 0)
    // return 1;

    // return x * power(x, n - 1);

    // * O(n) TC
    // * O(n) SC

    // }

    public static int optimizedPower(int x, int n) {
        if (n == 0)
            return 1;
        int half = optimizedPower(x, n / 2);
        int halfPowSq = half * half;
        if (n % 2 != 0) {
            return x * halfPowSq;
        }
        return halfPowSq;
        // *TC: log n */
    }

    public static void main(String[] args) {
        int x = 3;
        System.out.println(" x to pow n is : " + optimizedPower(x, 11));
    }
}
