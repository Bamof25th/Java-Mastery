package recursion;

public class fibonacci {

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int f1 = fib(n - 1);
        int f2 = fib(n - 2);
        int ans = f1 + f2;

        return ans;
    }

    public static void main(String[] args) {
        int n = 10;

       System.out.println(fib(n));
    }
}
