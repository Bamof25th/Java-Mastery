package backtraking;

public class girdWays {
    public static int gridways(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }

        // faith
        int w1 = gridways(i + 1, j, n, m);
        int w2 = gridways(i, j + 1, n, m);
        return w1 + w2;
    }

    // public static int gridwaysMath(int n, int m) {
    // // by premutation

    // }
    public static int uniquePaths(int m, int n) {
        // \

        int i = permutation(n - 1);
        int j = permutation(m - 1);

        int ans = permutation(n - 1 + m - 1) / (i * j);
        return ans;

    }

    public static int permutation(int n) {
        // basecase
        if (n == 0) {
            return 1;
        }

        // faith
        int prem = n * permutation(n - 1);
        return prem;
    }

    public static void main(String[] args) {
        int n = 10, m = 10;
        // System.out.println(gridways(0, 0, n, m));
        System.out.println(uniquePaths(m, n));
    }
}
