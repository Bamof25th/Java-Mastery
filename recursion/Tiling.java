package recursion;

public class Tiling {

    public static int proTiles(int n) {
        // base case
        if (n == 0 || n == 1)
            return 1;

        // vertical choice
        int fnm1 = proTiles(n - 1);

        // horizontal choice
        int fnm2 = proTiles(n - 2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(proTiles(2));
    }
}
