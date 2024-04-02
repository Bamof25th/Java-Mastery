package recursion;

public class binaryStr {

    public static void printBinaryStr(int n, int lastPlace, String str) {
        // Base case: if the string]
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // if (lastPlace == 0) {
        // printBinaryStr(n-1, 0, str.append("0"));
        // printBinaryStr(n, 1, str.append("1 "));
        // }else{

        // printBinaryStr(n-1, 0, str.append("0"));
        // }

        printBinaryStr(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStr(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryStr(3, 0, "");
    }
}
