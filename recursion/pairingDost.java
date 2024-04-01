package recursion;

public class pairingDost {
    public static int friendsParing(int n) {
        // base
        if (n == 1 || n == 2)
            return n;

        // kaam or faith
        int fnm1 = friendsParing(n - 1);
        int fnm2 = friendsParing(n - 2);
        int pairWays = (n - 1) * fnm2;

        int totalWays = fnm1 + pairWays;

        return totalWays;

    }

    public static void main(String[] args) {
            System.out.println(friendsParing(3));
    }
}
