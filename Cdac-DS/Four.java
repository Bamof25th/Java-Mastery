
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Four {
    public static boolean isPrime(int n) {

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNo(int n) {
        int ans = 0;
        while (n != 0) {
            int t = n % 10; // 78
            ans = ans * 10 + t; // 9 // 9*10+8 = 98
            n /= 10; // 7
        }
        return ans;
    }

    public static List<Integer> reverseIfPrime(List<Integer> list) {
        return list.stream().map(n -> {
            if (isPrime(n) && n > 10) {
                return reverseNo(n);
            }
            return n;
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add some numbers to the list
        list.add(23);
        list.add(37);
        list.add(13);
        list.add(41);
        list.add(31);
        list.add(11);

        List<Integer> ans = reverseIfPrime(list);

        System.out.println(ans);

    }

}
