package recursion;

/**
 * RecursionBasics
 */
public class RecursionBasics {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1); // recursive call to the function with decremented value of 'n'
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        // printDec(n);
        printInc(n);
    }
}