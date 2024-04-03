package backtraking;

/**
 * subsets
 */
public class subsets {
    public static void findSubsets(String str, String ans, int i) {

        // base case
        if (str.length() == i) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }
        // kaam recursion
        // Yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // NO choice
        findSubsets(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";

        findSubsets(str, "", 0);
    }
}